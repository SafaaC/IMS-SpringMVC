<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav>
  <ul>
    <li><a href="#" class="active">Home</a></li>
    <li><a href="#">About</a></li>
  </ul>
</nav>
<section>
	
		<form action="customer">
		<h1>Customer</h1>
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
					<div class="container text-center  mb-5">
				<button type="submit" class="btn btn-success">Add</button>
			</div>
		</form>
		<form action="customers">
		<div class="container text-center  mb-5">
				<button type="submit" class="btn btn-success" onclick="">Show All Customers</button>
			</div></form>
</section>
</body>
</html>