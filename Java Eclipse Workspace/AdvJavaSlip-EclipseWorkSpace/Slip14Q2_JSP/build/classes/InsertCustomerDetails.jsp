
<!-- Action page of the form submitted in AcceptCustomerDetails.html -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<%!
	int customerNumber = 0;
	int status = 0;
%>

<%
	try{
		status = 0;
		customerNumber = Integer.parseInt(request.getParameter("customerNumber"));
		String customerName = request.getParameter("customerName");
		String customerCity = request.getParameter("customerCity");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaSlip", "root", "root");
		
		String insertQuery = "INSERT INTO customer VALUES (?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setInt(1, customerNumber);
		ps.setString(2, customerName);
		ps.setString(3, customerCity);
		
		status = ps.executeUpdate();
		System.out.println("Status: " + status + "\n\n");
		
		con.close();
	}
	catch(Exception e)
	{
		System.out.println("Slip14 InsertCustoemrDetails.jsp Exception: " + e);
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action page</title>
</head>
<body>

		
	<%
		if(status != 0)
		{%>
			<h4 style="color: green;">Customer <%= customerNumber %> Data Inserted Successfully</h4>
			<p> <a href="AcceptCustomerDetail.html"> Click Here </a>, to insert another record </p>
	<%  }%>
	
	<%
		if(status == 0)
		{%>
			<h4 style="color: red;">Customer <%= customerNumber %> Data cannot be inserted. Try with another customer number</h4>
			<p> <a href="AcceptCustomerDetail.html"> Click Here </a>, to try again</p>
	<%  }%>
		
	
</body>
</html>