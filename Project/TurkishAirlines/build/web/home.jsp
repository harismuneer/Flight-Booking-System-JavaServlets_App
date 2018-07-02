<!DOCTYPE html>


<html lang="en">

 <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="icon" href="https://www-turkishairlines.akamaized.net/theme/img/icons/favicon.ico">
    <title>Turkish Airlines</title>

    <!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	
    <!-- Custom styles for this template -->
    <link href="./assets/css/carousel.css" rel="stylesheet">
  </head>

  
  <body style="background: -webkit-radial-gradient(rgb(118, 10, 138), rgb(5, 11, 18));background: radial-gradient(rgb(118, 10, 138), rgb(5, 11, 18));height:100%; min-height:100%;margin:0;padding:0;" >

  
	<header>
	<!--Navigation Bar-->
    <nav class="navbar navbar-expand-md navbar-dark font-weight-bold nav justify-content-center nav-justified" style="background:url('./assets/img/nav.jpg'); border:3px solid black;">
      <a class="navbar-brand" href="home.jsp">
	  	<img src="https://turkishairlines.ssl.cdn.sdlmedia.com/636373437847588165FE.png" alt="Turkish Airlines Logo">
		<img src="https://turkishairlines.ssl.cdn.sdlmedia.com/636373437818057738TL.png" alt="Img Logo">				
	  </a>
	  
	 <!-- When navigation bar is collapsed"-->
	 <div class="collapse navbar-collapse" style="display:inline!important;" id="navbarCollapse">
        <ul class="navbar-nav mr-auto nav nav-justified">
          <li class="nav-item">
            <a class="nav-link" href="home.jsp">Home<span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Login">Login</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="BookFlight">Book Flight</a>
          </li>
        </ul>
      </div>
    </nav>
	</header>
	
	<!--Slider-->
   <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel" data-pause="false" style="border-bottom:3px solid black; margin-bottom:1px;">
	<ol class="carousel-indicators">
		<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
		<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
		<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
	</ol>
	
	<div class="carousel-inner">
		<div class="carousel-item active">
			<img class="d-block" src="./assets/img/main.jpg" alt="First slide">
			<div class="carousel-caption d-md-block text-top">
				<h1>Welcome to Turkish Airlines!</h1>
			</div>
		</div>
		
		<div class="carousel-item">
			<img class="d-block img-fluid" src="./assets/img/galaxy.jpg" alt="Second slide">
			<div class="carousel-caption d-md-block">
				<h1>Where do you want to explore?</h1>
			</div>
		</div>
    
		<div class="carousel-item">
			<img class="d-block img-fluid" src="./assets/img/milky.jpg" alt="Third slide">
			<div class="carousel-caption d-md-block">
				<h1>Awarded the best European Airlines for 2011-16!</h1>
			</div>
		</div>
	</div>
	
	<!--Carousel indicators-->
		<a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span>
			<span class="sr-only">Previous</span>
		</a>
		<a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>


                <jsp:include page="Templates/Footer.jsp"/>
    
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

<svg xmlns="http://www.w3.org/2000/svg" width="500" height="500" viewBox="0 0 500 500" preserveAspectRatio="none" style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;"><defs><style type="text/css"></style></defs><text x="0" y="25" style="font-weight:bold;font-size:25pt;font-family:Arial, Helvetica, Open Sans, sans-serif">500x500</text></svg>
</body>
</html>