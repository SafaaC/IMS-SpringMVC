<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Inventory</title>
</head>
<body>
	<h1 class="text-center mb-3">Inventory</h1>
	<div class="container mt-5 w-75">
		<form action="purchases" method="post">
			<div class="form-group">
				<label for="date">Date</label> <input type="text"
					class="form-control" id="date" placeholder="dd/mm/yyyy"
					name="purchaseDate" >
			</div>
			<div class="form-group">
				<label for="sellerName">Seller Name</label> <input type="text"
					class="form-control" id="sellerName" placeholder="sellerName"
					name="sellerName" required>
			</div>
			<div class="form-group">
				<label for="batchNumber">Batch Number</label> <input type="text"
					class="form-control" id="batchNumber" placeholder="batchNumber"
					name="batchNumber"  required>
			</div>
			<div class="form-group">
				<label for="productName">Product Name</label> <input type="text"
					class="form-control" id="productName"
					placeholder="Enter productName" name="productName" required>
			</div>
			<div class="form-group">
				<label for="quantity">Quantity</label> <input type="text"
					class="form-control" id="quantity" name="quantity" required>
			</div>
			<div class="form-group">
				<label for="purchaseRate">Purchase Rate</label> <input type="text"
					class="form-control" id="purchaseRate" name="purchaseRate" required>
			</div>
			<div class="form-group">
				<label for="SellingRate">Selling Rate</label> <input type="text"
					class="form-control" id="SellingRate" name="sellingRate" required>
			</div>
			<div class="form-group">
				<label for="expiryDate">Expiry Date</label> <input type="text"
					class="form-control" id="expiryDate" placeholder="dd/mm/yyyy"
					name="expiryDate" required>
			</div>

			<div class="container text-center  mb-5">
				<button type="submit" class="btn btn-success">Submit</button>
			</div>

		</form>
	</div>
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

