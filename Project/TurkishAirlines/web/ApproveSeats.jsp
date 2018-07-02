
<%@page import="models.Flight"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
	<head>

            <jsp:include page="Templates/HeadMetaInfo.jsp"/>
            <title>Approve Seats</title>

	</head>

	<body style="background-color:black;  background: url('./assets/img/dashboard.jpg'); background-size:cover;">
  	
                <jsp:include page="Templates/AdminHeader.jsp"/>
		
		
		<div class="row">
			
                <jsp:include page="Templates/ManagerPanel.jsp"/>

                <!-- Table -->
		<section class="col-9" style="margin:1%;">
		<table class="table table-inverse table-striped table-bordered table-hover mx-auto table-responsive">
		  <thead>
			<tr>
			  <th>#</th>
			  <th>Flight</th>
			  <th>Economy</th>
			  <th>Business</th>
			  <th>First Class</th>
			  <th>Total Seats</th>
                          <th>Status</th>
			</tr>
		  </thead>
		  <tbody>
                        <%
                            ArrayList<Flight> flights = (ArrayList<Flight>)(application.getAttribute("flights"));
                            boolean change = false;
                            
                            for (int i = 0; i < flights.size(); i++)
                            {
                                out.print("<form action='ApproveSeats.do' method='post'>");
                                out.print("<tr>");
                                out.print("<th scope='row'>" + (i+1) + "</th>");
                                out.print("<td> <input type='text' name='flight_name' readonly  value='" + flights.get(i).getFlightName() + "' > </td>");
                                
                                if ((flights.get(i).getOldESeats() != flights.get(i).getEconomySeats()) && flights.get(i).isChanged)
                                {
                                    out.print("<td class = 'bg-success text-white'>");
                                }
                                else
                                    out.print("<td>");
                                
                                out.print("  <input type='number' name='seats_e' min='0' max='50' placeholder='0-50' disabled  value='" + flights.get(i).getEconomySeats() + "' > </td>");


                                if ((flights.get(i).getOldBSeats() != flights.get(i).getBusinessSeats()) && flights.get(i).isChanged)
                                {
                                    out.print("<td class = 'bg-success text-white'>");
                                }
                                else
                                    out.print("<td>");
                                
                                out.print("  <input type='number' name='seats_b' min='0' max='50' placeholder='0-50' disabled  value='" + flights.get(i).getBusinessSeats() + "' > </td>");

                                
                                if ((flights.get(i).getOldFSeats() != flights.get(i).getFirstSeats()) && flights.get(i).isChanged)
                                {
                                    out.print("<td class = 'bg-success text-white'>");
                                }
                                else
                                    out.print("<td>");
                                
                                out.print("  <input type='number' name='seats_f' min='0' max='50' placeholder='0-50' disabled  value='" + flights.get(i).getFirstSeats() + "' > </td>");
                                
                                if ((flights.get(i).getOldTSeats() != flights.get(i).getTotalSeats() && flights.get(i).isChanged))
                                {
                                    out.print("<td class = 'bg-success text-white'>");
                                }
                                else
                                    out.print("<td>");
                                
                                out.print("  <input type='number' name='seats_t' readonly value='" + flights.get(i).getTotalSeats() + "' > </td>");
                                
                                if (flights.get(i).isChanged)                                
                                {
                                    change = true;
                                    out.print("<td>");
                                    out.print("<input type='submit' class='btn btn-primary flex-row-reverse' value ='Approve'>");
                                    out.print("<input type='submit' class='btn btn-primary flex-row-reverse' formaction='DisapproveSeats.do' value= 'Reject' style='margin-left:4%;'>");                                                                
                                    out.print("</td>");
                                }

                                out.print("</tr>");
                                out.print("</form>");
                            }
                        
                        %>
                                
                                
                  </tbody>       
		</table>
                <%

                    if (change == false)
                    {
                        out.print("<div style='text-align:center;' class='bg-success text-white'>");
                        out.print("No changes to be approved/disapproved.");
                        out.print("</div>");
                    }

                %>
                <script>
			function calculate_total(){
				e = document.getElementsByName("seats_e");
				b = document.getElementsByName("seats_b");
				f = document.getElementsByName("seats_f");
				
				for (i = 0; i < e.length; i++) { 
					document.getElementsByName("seats_t")[i].value =  Number(e[i].value) + Number(b[i].value) + Number(f[i].value);
				}
			}
		</script>


		<div style="text-align:right;margin:1%;">
                    <button  class="btn btn-primary flex-row-reverse" onclick="calculate_total();">Calculate Total Seats</button>
		</div>
		</section>
		</div>

		
                <jsp:include page="Templates/Footer.jsp"/>
                
	</body>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
  </body>
</html>