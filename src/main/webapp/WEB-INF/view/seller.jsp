<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="seller">
			<div class="form-group">
			<label for="sellerName">Seller Name</label> <input type="text"
					class="form-control" id="sellerName" placeholder="Name"
					name="sellerName" required>
			</div>
			<div class="form-group">
				<label for="sellerContact">Seller Contact</label> <input type="text"
					class="form-control" id="sellerContact" 
					name="sellerContact" required></div>
			<div class="form-group">
				<label for="sellerAddress">Seller Address</label> <input type="text"
					class="form-control" id="sellerAddress" 
					name="sellerAddress" required></div>
		</form>
</body>
</html>