
<!--
	Slip17 2. Write a JSP which displays all the records from product table (pno,pname,price).
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Product Records</title>
</head>
<body>

	<h1> Displaying Product Table Records </h1>
	
	<table border="1">
	
		<thead>
			<tr>
				<td> Product Number </td>
				<td> Product Name </td>
				<td> Product Price </td>
			</tr>
		</thead>

<%
	try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaSlip", "root", "root");
		
		String selectQuery = "SELECT * FROM product";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(selectQuery);
		while(rs.next())
		{
%>

		<tbody>
			<tr>
				<td> <%= rs.getInt("product_number") %> </td>
				<td> <%= rs.getString("product_name") %> </td>
				<td> <%= rs.getInt("product_price") %> </td>
			</tr>
		</tbody>

<%
		} /* while loop close */
		
		con.close();
	} /* try block close */
	catch(Exception e)
	{
		System.out.println("Slip17Q2.jsp Exception: " + e);
	} /* catch block close */
%>
	
	</table>

</body>
</html>