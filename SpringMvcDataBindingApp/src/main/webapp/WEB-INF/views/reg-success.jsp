<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>success</h1>
	<table>
		<tr>
			<td>employee id:</td>
			<td>${employee1.id}</td>
		</tr>
		<tr>
			<td>employee name:</td>
			<td>${employee1.name}</td>
		</tr>
		<tr>
			<td>employee salary:</td>
			<td>${employee1.salary}</td>
		</tr>
		<tr>
			<td>employee mobile:</td>
			<td>${employee1.mobileNumber}</td>
		</tr>
		<tr>
			<td>employee dob:</td>
			<td>${employee1.dob}</td>
		</tr>
		
		<td>${messages}</td>
	</table>
	
	
</body>
</html>