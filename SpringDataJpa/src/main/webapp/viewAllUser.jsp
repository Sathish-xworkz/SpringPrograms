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
	<h2>viewAllUser</h2>
<a href="reg">Register</a>
<a href="login">Login</a>


	<table style="width: 50%;  margin-left: 20%;" border="2">
		<tr>
			<th>Id</th>
			<th>UserName</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.email}</td>
				<td><a href="deleteUser?id=${user.id}" onclick="return confirm('do you want delete ?')">Delete</a></td>
				<td><a href="editUser?id=${user.id}"">edit</a></td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>