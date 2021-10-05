
<!--  
	Slip18 2. Write JSP which displays all the records from customer table (cno, cname, city).
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Customer Table Records</title>
</head>
<body>

	<h1> Displaying Customer Table Records </h1>
	
	<table border="1">
	
		<thead>
			<tr>
				<td> Customer Number </td>
				<td> Customer Name </td>
				<td> Customer City </td>
			</tr>
		</thead>

<%
	try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaSlip", "root", "root");
		
		String selectQuery = "SELECT * FROM customer";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(selectQuery);
		while(rs.next())
		{
%>

		<tbody>
			<tr>
				<td> <%= rs.getInt("customer_number") %> </td>
				<td> <%= rs.getString("customer_name") %> </td>
				<td> <%= rs.getString("customer_city") %> </td>
			</tr>
		</tbody>

<%
		} /* while loop close */
		
		con.close();
	} /* try block close */
	catch(Exception e)
	{
		System.out.println("Slip18Q2.jsp Exception: " + e);
	} /* catch block close */
%>
	
	</table>

</body>
</html>