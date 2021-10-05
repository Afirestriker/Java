<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- Slip08 2. Write one HTML page which accepts 2 numbers and displays their multiplication and
subtraction using JSP. -->

<% 
	int number1 = Integer.parseInt( request.getParameter("number1") );
	int number2 = Integer.parseInt( request.getParameter("number2") );
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Slip08Q2</title>
</head>
<body>

	<p>Multiplication of <%= number1 + " & " + number2 %> is: <b><%= number1*number2 %></b></p>
	
	<p>Subtraction of <%= number1 + " & " + number2 %> is: <b> <%= number1-number2 %> </b> </p>

</body>
</html>