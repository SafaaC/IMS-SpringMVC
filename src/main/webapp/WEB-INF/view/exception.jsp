

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="resource/css/general.css" />
<link rel="stylesheet" type="text/css" href="resource/css/error.css" />
<meta charset="ISO-8859-1">
<title>IMS</title>
<link rel="icon" type="image/x-icon" href="resource/images/icon2.jpg">
</head>
<body>

	<nav>
		<img style="float: left; width: 70px; height: 50px;"
			src="resource/images/icon2.jpg" alt="Website Logo">
		<p>IMS</p>
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link " href="home.jsp">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="about.jsp">About</a></li>
		</ul>
	</nav>
	<div class="error-page">
		<h1>Oops! Something went wrong</h1>
		<p>We apologize for the inconvenience. Please try again later.</p>
		<p class="error-code">Error 404</p>
		<a href="/InventoryMngmnt/home.jsp" class="return-button">Return to Home</a>
	</div>

</body>
</html>