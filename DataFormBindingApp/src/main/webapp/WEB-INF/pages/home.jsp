<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1 style="color: red; text-align: center;">Employee Registration Page</h1>
	<form method='POST'>
		<table style="margin:auto">
			<tr>
				<th>ENO</th>
				<td><input type='text' name='id'></td>
			</tr>
			<tr>
				<th>ENAME</th>
				<td><input type='text' name='name'></td>
			</tr>
			<tr>
				<th>EDESG</th>
				<td><input type='text' name='desig'></td>
			</tr>
			<tr>
				<th>SALARY</th>
				<td><input type='text' name='salary'></td>
			</tr>
			<tr>
				<th></th>
				<td><input type='submit' value='register'></td>
			</tr>
		</table>
	</form>
</body>
</html>