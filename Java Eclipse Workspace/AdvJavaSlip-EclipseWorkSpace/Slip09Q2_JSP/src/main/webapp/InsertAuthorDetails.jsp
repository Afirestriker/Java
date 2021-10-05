
<!-- This page is a Form-Action of Slip09Q2.jsp page -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<%
	int authorNumber = Integer.parseInt(request.getParameter("authorNumber"));
	String authorName = request.getParameter("authorName");
	String authorSubject = request.getParameter("authorSubject");
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaSlip", "root", "root");
		
		String insertQuery = "INSERT INTO author values (?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setInt(1, authorNumber);
		ps.setString(2, authorName);
		ps.setString(3, authorSubject);
		
		int insertStatus = ps.executeUpdate();
		
		if(insertStatus != 0)
		{
			response.sendRedirect("Slip09Q2.jsp?status=inserted");
		}
		else
		{
			response.sendRedirect("Slip09Q2.jsp?status=error");
		}
		
		con.close();
	}
	catch(Exception e)
	{
		System.out.println("Slip09 Q2 InserAuthorDetails.jsp Exception: " + e);
	}
%>
