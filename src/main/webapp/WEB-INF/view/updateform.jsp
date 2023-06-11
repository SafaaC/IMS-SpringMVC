<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
<!doctype html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" type="text/css" href="resource/css/general.css" />
<link rel="stylesheet" type="text/css"
	href="resource/css/formsection.css" />
<link rel="stylesheet" type="text/css" href="resource/css/form.css" />
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
			<li class="nav-item"><a class="nav-link " href="/InventoryMngmnt/">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="about.jsp">About</a></li>
		</ul>
	</nav>
	<header>
		<h1>Update Product
		</h1>
	</header>
	<section class="form-section">
	<div class="container mt-5 w-75">
	
		<form action="${pageContext.request.contextPath}/purchases" method="post">
			<input type="text" value="${p.productId}" name="productId" readonly>
			<div class="form-group">
				<label for="purchaseDate">Date</label> <input type="text"
					class="form-control" id="purchaseDate"
					name="purchaseDate" value="${p.purchaseDate}" >
			</div>
			<div class="form-group">
				<label for="sellerName">Seller Name</label> <input type="text"
					class="form-control" id="sellerName" placeholder="sellerName"
					name="sellerName" value="${p.sellerName}" required>
			</div>
			<div class="form-group">
				<label for="batchNumber">Batch Number</label> <input type="number"
					class="form-control" id="batchNumber" placeholder="batchNumber"
					name="batchNumber " value="${p.batchNumber}"   required>
			</div>
			<div class="form-group">
				<label for="productName">Product Name</label> <input type="text"
					class="form-control" id="productName"
					placeholder="Enter productName" name="productName" value="${p.productName}" required>
			</div>
			<div class="form-group">
				<label for="quantity">Quantity</label> <input type="number"
					class="form-control" id="quantity" name="quantity" value="${p.quantity}"  required>
			</div>
			<div class="form-group">
				<label for="purchaseRate">Purchase Rate</label> <input  type="number" step="any"
					class="form-control" id="purchaseRate" name="purchaseRate" value="${p.purchaseRate}"  required>
			</div>
			<div class="form-group">
				<label for="SellingRate">Selling Rate</label> <input type="number" step="any"
					class="form-control" id="SellingRate" name="sellingRate" value="${p.sellingRate}"   required>
			</div>
			<div class="form-group">
				<label for="expiryDate">Expiry Date</label> <input type="text"
					class="form-control" id="expiryDate" placeholder="dd/mm/yyyy"
					name="expiryDate" value="${p.expiryDate}" required>
			</div>

			<div class="container text-center  mb-5">
				<button type="submit" class="btn btn-success">Update</button>
			</div>

		</form>
		<div class="container text-center  mb-5">
			<button class="btn btn-success" onclick="history.back()">Go
				Back</button>
		</div>
	</div></section>
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