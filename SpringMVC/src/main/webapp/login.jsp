<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
	<h1>Welcome to Login Page</h1>
	<a href="home">Home</a>
	<a href="reg">register</a>
	<form action="userlogin" method="post">
		<div>
			UserName:<input type="text" name="user">
		</div>
		<div>
			Password:<input type="password" name="pass">
		</div>
		<input type="submit" value="Login"> <input type="reset">
	</form>
</body>
</html>