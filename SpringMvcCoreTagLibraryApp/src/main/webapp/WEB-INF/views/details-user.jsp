<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>user success page!!!</h1>
	<p>${application} </p>
	<p>user Name: ${user.name}</p>
	<p>user email: ${user.email}</p>
	<p>user birthday: ${user.birthday}</p>
	<p>user age: ${user.age}</p>
	<p>user role: ${user.role}</p>
	<p>Address Info:</p>
	<p>user role: ${user.address.street}</p>
	<p>user role: ${user.address.state}</p>
	<p>user role: ${user.address.zipcode}</p>
</body>
</html>