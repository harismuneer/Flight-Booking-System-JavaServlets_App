
<%@page import="models.Seat"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
	<head>

            <jsp:include page="Templates/HeadMetaInfo.jsp"/>
            <title>Current Booking</title>

	</head>

	<body style="background-color:black;  background: url('./assets/img/dashboard.jpg'); background-size:cover;">
  	
                <jsp:include page="Templates/CustomerHeader.jsp"/>
		
                <br><br><br><br>
                <h1 style = "color:white; text-align:center;">Current Bookings</h1>
		<br><br>
                <div class="row">
			
                <div class="col-2"></div>

                <!-- Table -->
		<section class="col-9" style="margin:1%;">
		<table class="table table-inverse table-striped table-bordered table-hover mx-auto table-responsive">
		  <thead>
			<tr>
			  <th>#</th>
			  <th>Flight</th>
			  <th>Departure City</th>
			  <th>Arrival City</th>
			  <th>Departure Date</th>
			  <th>Arrival Date</th>
                          <th>Seat Number</th>
			</tr>
		  </thead>
		  <tbody>
                        <%
                            ArrayList<Seat> seats = (ArrayList<Seat>)(request.getAttribute("seats"));

                            for (int i = 0; i < seats.size(); i++)
                            {
                                out.print("<tr>");
                                out.print("<th scope='row'>" + (i+1) + "</th>");
                                out.print("<td>" + seats.get(i).getFlight().getFlightName() +  "</td>");
                                out.print("<td>" + seats.get(i).getFlight().getDepartureCity() +  "</td>");
                                out.print("<td>" + seats.get(i).getFlight().getArrivalCity() +  "</td>");
                                out.print("<td>" + seats.get(i).getFlight().getDepartureDate() +  "</td>");
                                out.print("<td>" + seats.get(i).getFlight().getArrivalDate() +  "</td>");
                                out.print("<td>" + seats.get(i).getSeatNumber() +  "</td>");                                
                                out.print("</tr>");
                            }                                                   
                        %>
                                
                                
                  </tbody>       
		</table>

                        <br><br><br><br><br><br>
                                
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