<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>welcome to request get parameter method....</h1>

	<% String messge=(String)request.getParameter("name"); 

	 out.println(messge); 
	 %>
	 
	 ${name}

</body>
</html>