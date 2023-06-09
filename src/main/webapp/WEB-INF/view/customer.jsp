<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="customer">
			<div class="form-group">
				<label for="customerName">Customer Name</label> <input type="text"
					class="form-control" id="customerName" placeholder="Name"
					name="customerName" required>
			</div>
			<div class="form-group">
				<label for="customerContact">Customer Contact</label> <input type="text"
					class="form-control" id="customerContact" 
					name="customerContact" required></div>
			<div class="form-group">
				<label for="customerAddress">Customer Address</label> <input type="text"
					class="form-control" id="customerAddress" 
					name="customerAddress" required></div>
		</form>
</body>
</html>