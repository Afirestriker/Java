<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update (Edit) contacts table</title>
</head>
<body>

	<h1>Edit contacts page</h1>
	<%
		int status = 0;
	
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String place = request.getParameter("place");
		String comment = request.getParameter("comment");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hireupv1", "root", "root");
		
		String edit_contact = "UPDATE contacts SET contact_name=?, contact_email=?, contact_place=?, contact_comment=? WHERE contact_name=?";
		
		PreparedStatement pst = con.prepareStatement(edit_contact);
		pst.setString(1, name);
		pst.setString(2, email);
		pst.setString(3, place);
		pst.setString(4, comment);
		pst.setString(5, name);

		status = pst.executeUpdate();
	%>
	
	<%= "\t" + status + "Record Updated" %>
	

</body>
</html>