<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>
<%@ page import="DbConnection.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Displaying all Records of Contacts Table</h1>
	
	<%
		Connection con = JdbcConnection.getConnection();
		Statement st = con.createStatement();
		
		String sq = "SELECT * FROM contacts where contact_name='name2' ";
		ResultSet rs = st.executeQuery(sq);
	%>
	
	<TABLE BORDER="1">
      <TR>
      	<TH>Name</TH>
      	<TH>Email</TH>
      	<TH>Place</TH>
      	<TH>Comment</TH>
      </TR>
	
	<% while(rs.next()) {%>
		<tr>
			<td> <%= rs.getString(1) %> </td>
			<td> <%= rs.getString(2) %> </td>
			<td> <%= rs.getString(3) %> </td>
			<td> <%= rs.getString(4) %> </td>
		</tr>
			
	<% } %>
	
	</TABLE>
	
</body>
</html>