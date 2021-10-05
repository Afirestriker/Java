
<!-- 
	Slip11 2. Write a JSP which displays all the records from train table(trno, trname, source,
destination).
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Train Table Records</title>
</head>
<body>

	<h1> Displaying Train Table Records</h1>

	<table border="1">
		<thead>
			<tr>
				<th> Train_no </th>
				<th> Train_Name </th>
				<th> Train_Source </th>
				<th> Train_Destination </th>
			</tr>
		</thead>

	<%
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaSlip", "root", "root");
		
		String selectQuery = "SELECT * FROM train";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(selectQuery);
		while(rs.next())
		{
			
	%>
		<tbody>
			<tr>
				<td> <%= rs.getInt("train_no") %> </td>
				<td> <%= rs.getString("train_name") %> </td>
				<td> <%= rs.getString("train_source") %> </td>
				<td> <%= rs.getString("train_destination") %> </td>
			</tr>
		</tbody>

	<%
		} /* while loop close */
		con.close();
	}/* try block close */
	catch(Exception e)
	{
		System.out.println("Slip11Q2.jsp Exception: " + e);
	} /* catch block close */
	%>

	</table>


</body>
</html>