<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SAMPLE JSP PROJECT</title>
<link rel="stylesheet" href="../CSS/index.css" >
</head>
<body>

	<h1>HELLO JSP</h1>
	<hr>
	<!-- JSP Scriplet Tag-->
	<% 
		System.out.println("This is scriptlet tag code, it will only run in background / display only in console");
		
		out.print("Writte in scriplet tag, and display message on browser");
		
		out.print("<br><br> WELCOME " + request.getParameter("uname"));
	%>
	
	<br><br>
	
	<!-- JSP Expression Tag  -->
	<%= "WELCOME " + request.getParameter("uname")%>
	
	<br><br>
	
	<!--  JSP Declaration Tag -->
	<%! int cube(int n)
		{
			return n*n*n;
		}
	%>	
	<%= "Cube of 3: " + cube(3) %>
	
</body>
</html>