<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" isErrorPage="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Success Page!!!</h2>

	<p>Name:${savedUser.name}</p>
	<p>Email:${savedUser.email}</p>
	<p>Age:${savedUser.age}</p>
	<p>Birthday:${savedUser.birthday}</p>
	<p>ROle:${savedUser.role}</p>

	<p>Address Info</p>
	<p>Street:${savedUser.address.street}</p>
	<p>State:${savedUser.address.state}</p>
	<p>zipcode:${savedUser.address.zipcode}</p>

</body>
</html>