<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.time.LocalDateTime" %>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Help Services</title>
</head>
<body>
	<% 
/* 	String name=(String)request.getAttribute("name"); 
	Integer id=(Integer)request.getAttribute("id");
	LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
	%>
	
	<h1>My name is ${name}</h1>
	<h1>My Id is ${id}</h1>
	<h1>Current Time ${time}
		${name}</h1>
		
	<c:forEach var="item" items="${marks}">
	 	<h1>${item}</h1>
	</c:forEach>
	
</body>
</html>