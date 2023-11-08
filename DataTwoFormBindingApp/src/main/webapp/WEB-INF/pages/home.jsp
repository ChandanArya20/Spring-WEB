<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1 style="color: red; text-align: center;">Employee Registration Page</h1>
	<form:form modelAttribute="emp">
		<table style="margin:auto">
			<tr>
				<th>E_id</th>
				<td><form:input path='id' /></td>
			</tr>
			<tr>
				<th>ENAME</th>
				<td><form:input path='name'/></td>
			</tr>
			<tr>
				<th>EDESG</th>
				<td><form:input path='desig'/></td>
			</tr>
			<tr>
				<th>SALARY</th>
				<td><form:input path='salary'/></td>
			</tr>
			<tr>
				<th></th>
				<td><input type='submit' value='register'/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>