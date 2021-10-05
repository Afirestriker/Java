
<!-- 
	Slip10 2. Write a JSP which displays all the records from event table(evno, evname, venue).
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Event Table</title>
</head>
<body>

	<h1> Displaying Event Table </h1>

	<table border="1">
		<thead>
			<tr>
				<th> Event_Number </th>
				<th> Event_Name </th>
				<th> Event_Venue </th>
			</tr>
		</thead>

<%
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaSlip", "root", "root");
	
	String selectQuery = "SELECT * FROM event";
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(selectQuery);
	while(rs.next())
	{
		
%>
		<tbody>
			<tr>
				<td> <%= rs.getInt("event_no") %> </td>
				<td> <%= rs.getString("event_name") %> </td>
				<td> <%= rs.getString("event_venue") %> </td>
			</tr>
		</tbody>

<%
	} /* while loop close */
	con.close();
}/* try block close */
catch(Exception e)
{
	System.out.println("Slip10Q2.jsp Exception: " + e);
} /* catch block close */
%>
	</table>

</body>
</html>