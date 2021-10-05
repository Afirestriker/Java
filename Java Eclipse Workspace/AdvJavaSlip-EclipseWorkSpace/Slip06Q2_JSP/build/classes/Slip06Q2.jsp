
<!--  
	Slip06 2. Write a JSP which accepts a number and displays its square and cube.
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Number square and cube</title>
</head>
<body>

	<h1> Enter number to find its Square and Cube </h1>
	
	<form action="Calculate.jsp" method="post">
		<input type="number" name="num" required >
		<br><br>
		<input type="submit" value="Calculate">
		
	</form> 

</body>
</html>