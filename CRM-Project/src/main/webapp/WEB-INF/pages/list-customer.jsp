<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/style.css"/>

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM-Customer Relationship Manager</h2>
		</div>
		<div id="container">
			<div id="content">
				<!-- put new button:: Add Customer -->
				
				<input class="add-button" type='button' value='Add Customer'
								onclick="window.location.href='showForm'"/>
				 
			
				<table>
					<tr>
						<th>FirstName</th>
						<th>LastName</th>
						<th>E-mail</th>				
					</tr>
					<c:forEach var="customer" items="${customers }">
						<tr>
							<td>${customer.firstName }</td>
							<td>${customer.lastName }</td>
							<td>${customer.email }</td>
						</tr>				
					</c:forEach>			
				</table>
			
			</div>
			
			
		</div>
	</div>
</body>
</html>