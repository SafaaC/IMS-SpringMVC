<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/temseller" method="post">
	
	<input type="text" value="${s.sellerId}" name="sellerId" readonly>
		<div class="form-group">
			<label for="sellerName">Seller Name</label> <input type="text"
				class="form-control" id="sellerName" placeholder="Name"
				name="sellerName" value="${s.sellerName}"  required>
		</div>
		<div class="form-group">
			<label for="sellerContact">Seller Contact</label> <input type="text"
				class="form-control" id="sellerContact" name="sellerContact" value="${s.sellerContact}" 
				required>
		</div>
		<div class="form-group">
			<label for="sellerAddress">Seller Address</label> <input type="text"
				class="form-control" id="sellerAddress" name="sellerAddress" value="${s.sellerAddress}" 
				required>
		</div>
		<div class="container text-center  mb-5">
			<button class="btn btn-success" onclick="history.back()">Go
				Back</button>
			<button type="submit" class="btn btn-success">Update</button>
		</div>
	</form>
</body>
</html>
<body>

</body>
</html>