<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Flight Search</title>
		
		<link rel="icon" href="https://www-turkishairlines.akamaized.net/theme/img/icons/favicon.ico">

        <!-- CSS -->        
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">
		
    </head>
	
	

  <body style="background: -webkit-radial-gradient(rgb(136, 15, 159), rgb(6, 19, 31));  background: radial-gradient(rgb(136, 15, 159), rgb(6, 19, 31)); background:url('./assets/img/main.jpg');">  

      <jsp:include page="Templates/CustomerHeader.jsp"/>
      

                <!-- Top content -->
        <div class="top-content">
            <div class="inner-bg" style="padding:0px 0px 80px 0;">
                <div class="container">
                    <div class="row" style="margin-left:17%; margin-right:17%;">
                        
                        <div>
                        	<div class="form-box">
	                        	<div class="form-top">
	                        		<div class="form-top-left">
	                        			<h3 style ="color:white;">Complete the Following</h3>
	                        		</div>
	                        		<div class="form-top-right">
	                        			<i class="fa fa-plane"></i>
	                        		</div>
	                            </div>
	                            <div class="form-bottom" style="color:white;">
				                    <form role="form" action="SearchFlights.do" method="post" class="flight-search-form">
                                                        
                                                        <div class="row">                                                            
				                    	<div class="form-group col-lg-4 ui-widget">
				                    		<label for="from">From</label>
				                        	<input required type="text" name="from" placeholder="Departure City..." class="form-control" id="osearch" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;">                                                                
				                        </div>
				                        <div class="form-group col-lg-4 ui-widget">
				                        	<label for="to">To</label>
				                        	<input required type="text" name="to" placeholder="Destination City..." class="form-control" id="dsearch" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;">
				                        </div>
				                    	<div class="form-group col-lg-4">
				                    		<label for="depart">Departure Date</label>
				                        	<input required type="date" name="depart" class="form-control" id="form-depart" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;">											
				                        </div>
									</div>
									
									<div class="row">
				                    	<div class="form-group col-lg-4">
				                    		<label for="class">Class</label>
				                        	<select required name="class" class="form-control" id="form-class" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;">
											<option value="Economy" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;"> Economy</option>
											<option value="Business" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;"> Business</option>
											<option value="First Class" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;"> First Class</option>
											</select>
				                        </div>
				                        <div class="form-group col-lg-4">
				                        	<label for="people">No. of People</label>
				                        	<input required type="number" min="1" max="4" placeholder="Number of People.." name="people" class="form-control" id="form-adults" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;">
				                        </div>

                                                                        </div>
										<div style="text-align:center;">
											<button style="margin-top:5%;" type="submit" style="" class="btn col-xs-5 col-md-5">Search Flights</button>
										</div>
									</form>
			                    </div>
		                    </div>
		            
                        </div>

                    </div>
                    
                </div>
            </div>
            
        </div>

        <jsp:include page="Templates/Footer.jsp"/>

   <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
  
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="assets/autocompleter.js"></script>
     
  </body>

</html>


