<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>${messages}</h4>
	<form:errors path="employee1.*" />
	<h1>Employee Registration Form</h1>
	<form action="register" method="post">
		<table>
			<tr>
				<td>employee id:</td>
				<td><input type="text" name="id">
			</tr>
			<tr>
				<td>employee Name:</td>
				<td><input type="text" name="name">
			</tr>
			<tr>
				<td>employee salary:</td>
				<td><input type="text" name="salary">
			</tr>
			<tr>
				<td>employee mobile number:</td>
				<td><input type="text" name="mobileNumber">
			</tr>
			<tr>
				<td>employee dob:</td>
				<td><input type="text" name="dob">
			</tr>
			<tr>
				<td><input type="submit" value="save">
			</tr>
		</table>


	</form>

</body>
</html>