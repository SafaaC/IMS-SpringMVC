<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="resource/css/general.css" />
<link rel="stylesheet" type="text/css"
	href="resource/css/formsection.css" />
<link rel="stylesheet" type="text/css" href="resource/css/form.css" />
<link rel="stylesheet" type="text/css" href="resource/css/button.css" />

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">


<title>IMS</title>
<link rel="icon" type="image/x-icon" href="resource/images/icon2.jpg">
</head>
<body>
	<nav>
		<img style="float: left; width: 70px; height: 50px;"
			src="resource/images/icon2.jpg" alt="Website Logo">
		<p>IMS</p>
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link "
				href="/InventoryMngmnt/">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="about.jsp">About</a></li>
		</ul>
	</nav>
	<header>
		<h1>Update Sale</h1>
	</header>
	<section class="form-section">
		<div class="container mt-5 w-75">
			<form action="/InventoryMngmnt/salesave" method="post">
				<div class="form-group">
					<label for="pId">Product ID</label> <input type="text"
						class="form-control" id="pId" placeholder="productID" name="pId"
						value="${s.pId}" required readonly>

				</div>
				<div class="form-group">
					<label for="date">Date</label> <input type="text"
						class="form-control" id="date" placeholder="dd/mm/yyyy"
						name="date" value="${s.date}" required="required">
				</div>
				<div class="form-group">
					<label for="customerName">Customer Name</label> <input type="text"
						class="form-control" id="customerName" placeholder="customerName"
						name="customerName" value="${s.customerName}" required>
				</div>
				<div class="form-group">
					<label for="productName">Product Name</label> <input type="text"
						class="form-control" id="productName" placeholder="productName"
						name="productName" value="${s.productName}" required readonly>
				</div>


				<div class="form-group">
					<label for="pid">Product Id</label> <input type="number"
						class="form-control" id="pId" placeholder="Enter productId"
						name="pId" value="${s.pId}" required>
				</div>
				<div class="form-group">
					<label for="quantity">Quantity</label> <input type="number"
						class="form-control" id="quantity" name="quantity"
						value="${s.quantity}" required>
				</div>
				<div class="form-group">
					<label for="amount">Amount</label> <input type="text"
						class="form-control" id="amount" name="amount" value="${s.amount}"
						required readonly>
				</div>

				<div class="container text-center  mb-5">
					<button type="submit" class="btn btn-success">Update</button>
				</div>

			</form>
			<div class="container text-center  mb-5">
				<button class="btn btn-success" onclick="history.back()">Back</button>
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