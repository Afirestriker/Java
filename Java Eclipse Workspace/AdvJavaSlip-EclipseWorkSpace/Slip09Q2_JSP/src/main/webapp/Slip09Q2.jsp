
<!--
 Slip09 2. Write one HTML page which accepts author details (ano,authorname,subject) and stores
 these details in table author. 
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Author Details</title>
</head>

<%! int authorCount = 0; %>
	<%
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaSlip", "root", "root");
			
			String countQuery = "SELECT COUNT(author_number) FROM author";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(countQuery);
			while(rs.next())
			{
				authorCount = rs.getInt(1);
			}
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Slip09Q2 Exception: " + e);
		}
	%>

<body>

	<h1> Enter Author Details </h1>

	<%
		String status = request.getParameter("status");
		if("inserted".equals(status))
		{%>
			<h3 style="color: green;"> Author Number <%= authorCount %> Successfully Added</h3>
	  <%}%>
	  
	<%  if("error".equals(status))
		{%>
			<h3 style="color: red;"> Error Inserting Data, Try Again</h3>
	  <%}%>

	<form action="InsertAuthorDetails.jsp" method="post">
		<table>
			<tr>
				<td> Author no: </td>
				<td> <input type="number" name="authorNumber" value="<%= authorCount+1 %>" required readonly> </td>
			</tr>
			
			<tr>
				<td> Author Name: </td>
				<td> <input type="text" name="authorName" required> </td>
			</tr>
			
			<tr>
				<td> Author Subject: </td>
				<td> <input type="text" name="authorSubject" required> </td>
			</tr>
			
			<tr>
				<td colspan="2"> <input type="submit" value="Insert Data"> </td>
			</tr>
		</table>
	</form>

</body>
</html>