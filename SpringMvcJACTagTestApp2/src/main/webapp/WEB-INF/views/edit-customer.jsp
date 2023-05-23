<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
<title>Edit a Customer</title>
</head>
<body>
	<form action="saveCustomer" method="post">

		<p>
			First Name: <input name="id" value="${customer.id}" />
		</p>
		<p>
			First Name: <input name="firstName" value="${customer.firstName}" />
		</p>
		<p>
			Last Name: <input name="lastName" value="${customer.lastName}" />
		</p>
		<p>
			Phone Number: <input name="phone" value="${customer.phone}" />
		</p>

		<input type="submit" value="Edit Customer">
	</form>
</body>
</html>