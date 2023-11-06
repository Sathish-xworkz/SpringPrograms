<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link
	href="/CustomerManagmentSystem/MyURLResources/css/mystyle.css"
	rel="stylesheet" />
</head>
<body>

<a href="login">Login</a>
<a href="view">ViewUsers</a>
<h1>New Student Registration</h1>
<form method="post" action="reguser" modelAttribute="user">
<div> UserName:<input type="text" name="username"> </div>
<div> password:<input type="text" name="password"> </div>
<div> Email:<input type="text" name="email"> </div>
<input type="submit" value="Register">
<input type="reset">
</form>
<div class="container">
		<h2>Registration Form</h2>
		<form action="saveCustomer" modelAttribute="customer" method="post">
			<div class="form-group">
				<label for="firstname">First Name</label> <input type="text"
					class="form-control" id="exampleInputfirstname" name="firstname">
			</div>
			<div class="form-group">
				<label for="lastname">Last Name</label> <input type="text"
					class="form-control" id="exampleInputlastname" name="lastname">
			</div>
			<div class="form-group">
				<label for="phoneno">Phone Number</label> <input type="text"
					class="form-control" id="exampleInputphoneno" name="phoneno">
			</div>
			<div class="form-group">
				<label for="Email1">Email address</label> <input type="email"
					class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="email">
			</div>
			<div class="form-group">
				<label for="Password">Password</label> <input type="password"
					class="form-control" id="exampleInputPassword" name="password">
			</div>
			<button type="submit" class="btn btn-primary" name="create">Sign up</button>
		</form>
	</div>
</body>
</html>