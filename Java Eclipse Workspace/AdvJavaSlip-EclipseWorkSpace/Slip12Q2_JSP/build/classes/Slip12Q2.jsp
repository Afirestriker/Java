<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- 
	Slip12 2. Write one HTML page which accepts a number. Submit this number to a JSP and display
	square and cube of this number 
-->

<!-- These page is called from Numbers.html -->

<%!
	int square(int n){
		return n*n;
	}

	int cube(int n)
	{
		return n*n*n;	
	}
%>

<% int num = Integer.parseInt( request.getParameter("number") ); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Slip06Q2</title>
</head>
<body>

	<p> Square and Cube of Number <b> <%= num %> </b> </p>

	<p>Square: <b> <%= square(num) %> </b> </p>
	<p>Cube:  <b> <%= cube(num) %> </b> </p>
	
</body>
</html>