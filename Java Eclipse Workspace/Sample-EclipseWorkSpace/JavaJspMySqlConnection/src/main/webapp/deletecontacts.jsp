<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>
<%@ page import="DbConnection.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update (Delete) contacts table</title>
</head>
<body>

	<h1>Delete Contact page</h1>
	
	<%
		int status=0;
		String name = request.getParameter("name");
		Connection con = JdbcConnection.getConnection();
		
		String deletecontact = "DELETE FROM contacts WHERE contact_name = ?";
		PreparedStatement pst = con.prepareStatement(deletecontact);
		pst.setString(1, name);
		status = pst.executeUpdate();
	%>
	
	<%= "\t" + status + " record(s) updated" %>

</body>
</html>