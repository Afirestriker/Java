<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login.jsp</title>
</head>
<body>

<%
	String uid = request.getParameter("uid");
	String password = request.getParameter("password");
	session.setAttribute("uid", uid);
	
	if(uid.equals("Java") && password.equals("Java"))
	{%>
		Welcome <%= uid %>
	<%}
	
	else 
	{%>
		<a href="LoginForm.html">Login</a> to continue...
	<%}
%>

</body>
</html>