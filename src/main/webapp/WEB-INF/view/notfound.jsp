<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" type="text/css" href="resource/css/general.css" />
<link rel="stylesheet" type="text/css" href="resource/css/error.css" />
<link rel="stylesheet" type="text/css"
	href="resource/css/returnbutton.css" />
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>IMS</title>
<link rel="icon" type="image/x-icon" href="resource/images/icon2.jpg">
</head>
<body style="background-color: white;">
	<nav>
		<img style="float: left; width: 70px; height: 50px;"
			src="resource/images/icon2.jpg" alt="Website Logo">
		<p>IMS</p>
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link " href="home.jsp">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="about.jsp">About</a></li>
		</ul>
	</nav>
	<section class="error-page"><div>
		<h1> ${mssg }</h1>
		<a href="home.jsp" class="return-button">Return to Home</a>
		<div >
		<button onclick="history.back()">Go Back</button>
	</div>
	</div>
	
	</section>
	
	
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>