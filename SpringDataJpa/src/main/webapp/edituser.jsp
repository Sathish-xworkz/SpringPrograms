<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="login">Login</a>
<a href="view">ViewUsers</a>
<h1>Edit Student </h1>
<form method="post" action="update" modelAttribute="update-user">
div> ID:<input readonly="readonly" type="text" value="${user.id }" name="id"> </div>
<div> UserName:<input type="text" value="${user.username }" name="username"> </div>
<div> password:<input type="text" value="${user.password }" name="password"> </div>
<div> Email:<input type="text" value="${user.email }" name="email"> </div>
<input type="submit" value="Update">
<input type="reset">
</form>
</body>
</html>