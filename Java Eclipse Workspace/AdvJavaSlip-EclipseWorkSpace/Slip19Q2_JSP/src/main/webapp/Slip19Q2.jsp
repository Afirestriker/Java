
<!--  
	Slip19 2. Write a JSP which display all the records from item table (itnono, itemname, rate).
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Item Table Records</title>
</head>
<body>

	<h1> Displaying Item Table Records </h1>
	
	<table border="1">
	
		<thead>
			<tr>
				<td> Item Number </td>
				<td> Item Name </td>
				<td> Item Rate</td>
			</tr>
		</thead>

<%
	try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaSlip", "root", "root");
		
		String selectQuery = "SELECT * FROM item";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(selectQuery);
		while(rs.next())
		{
%>

		<tbody>
			<tr>
				<td> <%= rs.getInt("item_no") %> </td>
				<td> <%= rs.getString("item_name") %> </td>
				<td> <%= rs.getString("item_rate") %> </td>
			</tr>
		</tbody>

<%
		} /* while loop close */
		
		con.close();
	} /* try block close */
	catch(Exception e)
	{
		System.out.println("Slip19Q2.jsp Exception: " + e);
	} /* catch block close */
%>
	
	</table>

</body>
</html>