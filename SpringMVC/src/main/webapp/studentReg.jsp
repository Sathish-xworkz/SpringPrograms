<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Registration Form</h2>
	<div>
		<form action="regStudent" method="post" modelAttribute="student">
			<div>
				<label>Id:</label> <input type="text" name="id">
			</div>
			<div>
				<label>Name:</label> <input type="text" name="name">
			</div>
			<div>
				<label>Course:</label> <input type="text" name="course">
			</div>
			<div>
				<label>Branch:</label> <input type="text" name="branch">
			</div>
			<div>
				<label>Rollno:</label> <input type="text" name="rollno">
			</div>
			<div>
				<label>Email:</label> <input type="text" name="email">
			</div>
			<input type="submit" value="Add">
		</form>
	</div>
</body>
</html>