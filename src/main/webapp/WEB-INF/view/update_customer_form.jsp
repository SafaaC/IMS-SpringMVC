<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/customer">
	<input type="text" value="${c.customerId}" name="customerId" readonly>
		<div class="form-group">
			<label for="customerName">Customer Name</label> <input type="text"
				class="form-control" id="customerName" placeholder="Name"
				name="customerName" value="${c.customerName}" required>
		</div>
		<div class="form-group">
			<label for="customerContact">Customer Contact</label> <input
				type="text" class="form-control" id="customerContact"
				name="customerContact" value="${c.customerContact}" required>
		</div>
		<div class="form-group">
			<label for="customerAddress">Customer Address</label> <input
				type="text" class="form-control" id="customerAddress"
				name="customerAddress" value="${c.customerAddress}" required>
		</div>
		<div class="container text-center  mb-5">
			<button class="btn btn-success" onclick="history.back()">Go
				Back</button>
			<button type="submit" class="btn btn-success">Update</button>
		</div>
	</form>
</body>
</html>