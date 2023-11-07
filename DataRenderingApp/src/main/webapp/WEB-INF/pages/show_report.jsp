<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Data page</title>
	<style type="text/css">
	h1,h3{
		text-align:center;
	
	}
	</style>
</head>
<body>
		<h1 style="color:red">Displaying Simple values</h1>
		<h3>Name : ${name }</h3>
		<h3>Age  : ${age }</h3>
		<h3>Address : ${address }</h3>
		<hr/>
		<h1 style="color:red">Displaying Array values</h1>
		<c:forEach items="${countryNames }" var="country">
		
			<h3>${country }</h3>
		
		</c:forEach>
		<hr/>
		<h1 style="color:red">Displaying List values</h1>
		<c:forEach items="${subjectLists }" var="subject">
		
			<h3>${subject }</h3>
		
		</c:forEach>
		<hr/>
		<h1 style="color:red">Displaying Set values</h1>
		<c:forEach items="${mobileSets }" var="mobile">
		
			<h3>${mobile }</h3>
		
		</c:forEach>
		<hr/>
		<h1 style="color:red">Displaying map values</h1>
		<c:forEach items="${idsMap }" var="id">
		
			<h3>${id.key }====> ${id.value }</h3>
		
		</c:forEach>
		
		
</body>
</html>