
<!--  
	Slip06 2. Write a JSP which accepts a number and displays its square and cube.
	
	This page is called from Slip06Q2.jsp on form submit
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Square and Cube</title>
</head>
<body>

	<%
		int num = Integer.parseInt(request.getParameter("num"));
	%>
	
	<h3> Square of <%= num %> is: <%= num*num %> </h3>
	
	<h3> Cube of <%= num %> is: <%= num*num*num %> </h3>
	
	<a href="Slip06Q2.jsp"> <button> Find Square and Cube for another number </button> </a>

</body>
</html>