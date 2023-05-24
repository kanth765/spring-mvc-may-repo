<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<base>
<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>
	${sa} ${application}
	<h1>User Registration Form</h1>

	<form:form modelAttribute="user">
		<%-- 		<form:errors path="*" cssClass="error" /> --%>
		<table>
			<tr>
				<td>USER NAME:</td>
				<td><form:input path="name" /> <form:errors path="name"
						cssClass="error" /></td>
			</tr>
			<tr>
				<td>EMAIL:</td>
				<td><form:input path="email" /> <form:errors path="email"
						cssClass="error" /></td>
			</tr>
			<tr>
				<td>BIRTHDAY:</td>
				<td><form:input path="birthday" /> <form:errors
						path="birthday" cssClass="error" /></td>
			</tr>

			<tr>
				<td>AGE:</td>
				<td><form:input path="age" /> <form:errors path="age"
						cssClass="error" /></td>
			</tr>
			<tr>
				<td>select Role:</td>
				<td><form:select path="role">
						<form:option value="">please select role</form:option>
						<form:options items="${roles}" />

					</form:select>
			</tr>
			<tr>
				<td>address info:</td>
			</tr>
			<tr>
				<td>street:</td>
				<td><form:input path="address.street" /> <form:errors
						path="address.street" cssClass="error" /></td>
			</tr>

			<tr>
				<td>state:</td>
				<td><form:input path="address.state" /> <form:errors
						path="address.state" cssClass="error" /></td>
			</tr>
			<tr>
				<td>zipcode:</td>
				<td><form:input path="address.zipcode" /> <form:errors
						path="address.zipcode" cssClass="error" /></td>
			</tr>


			<tr>
				<td><input type="submit" value="save"></td>
			</tr>


		</table>


	</form:form>
</body>
</html>