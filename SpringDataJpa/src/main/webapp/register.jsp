<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
</body>
</html>