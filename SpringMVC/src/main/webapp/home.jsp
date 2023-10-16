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
	<h1 style="color: green">Welcome to Xworkz online class</h1>
	<h2> <a href="viewproduct">ViewAllProducts</a> </h2>
	
	<h2>Login With: ${ username }</h2>
	<h2>Contact:${ph }</h2>

	<h4>${names[0] }</h4>
	<c:forEach var="name" items="${names}">
		<li>${name }</li>
	</c:forEach>
</body>
</html>