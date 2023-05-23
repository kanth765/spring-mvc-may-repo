<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<p> ${customer.cid} </p>
<p>Name: ${customer.firstName} ${customer.lastName}</p>
<p>Phone Number: ${customer.phone.areaCode} - ${customer.phone.prefix}- ${customer.phone.number}</p>
<p>Country: ${customer.country.id} </p>
</body>
</html>
</body>
</html>