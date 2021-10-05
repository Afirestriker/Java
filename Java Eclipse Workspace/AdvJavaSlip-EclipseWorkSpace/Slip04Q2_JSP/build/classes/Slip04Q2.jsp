<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- Slip04 2.Write a JSP which display sum of 51 to 60. -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Slip04Q2</title>
</head>
<body>

	<p>Sum of <b>51 to 60</b> </p>

	<%
		int sum=0;
		for(int i=51; i<=60; i++)
		{
			sum = sum + i;
		}
	%>
	<h3>Sum: <%= sum %></h3>

</body>
</html>