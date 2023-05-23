<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Add a new Customer</title>
</head>
<body>

	<h1>Add a new Customer</h1>
	<form:form action="saveCustomer" method="post"
		modelAttribute="customer">
		<p>
			Id:
			<form:input path="cid" />
		</p>
		<p>
			First Name:
			<form:input path="firstName" />
		</p>
		<p>
			Last Name:
			<form:input path="lastName" />
		</p>
		<p>
			Phone Number:
			<form:input path="phone" />
		</p>

		<p>
			select country:
			<%-- 			<form:select path="country.id" items="${countryList}"/>  --%>
			<%-- 			<form:select path="country.id" items="${myMap}"/>   --%>
<%-- 			<form:select path="country.id" items="${country}"  itemLabel="id"  itemValue="name"/> --%>
<form:select path="country.id">
<form:option value="--------">Please select Category</form:option>
<form:options items="${country}" itemLabel="id" itemValue="name" />

</form:select>
		</p>
		<input type="submit" value="Add Customer">
	</form:form>
</body>
</html>