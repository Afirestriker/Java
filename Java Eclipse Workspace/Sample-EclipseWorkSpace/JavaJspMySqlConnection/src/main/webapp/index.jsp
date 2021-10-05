<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="java.sql.*" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert record into contacts table</title>
</head>
<body>

	<h1>JSP and MySql Connectivity</h1>
	
	<%
	int status=0;
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hireupv1", "root", "root");
	
		//Inserting record(s) into mysql database
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String place = request.getParameter("place");
		String comment = request.getParameter("comment");
		System.out.println("\nName: " + name);
		System.out.println("\nEmail: " + email);
		System.out.println("\nPlace: " + place);
		System.out.println("\nComment: " + comment);
		
		
		String sq1 = "INSERT INTO contacts values(?, ?, ?, ?)";
		PreparedStatement pst = con.prepareStatement(sq1);
		pst.setString(1, name);
		pst.setString(2, email);
		pst.setString(3, place);
		pst.setString(4, comment);
		status = pst.executeUpdate();
		
		System.out.println("\n\n");
		
		
		//receiving records of contacts table form mysql
		Statement st = con.createStatement();
		String sq = "SELECT * from contacts";
		ResultSet rs = st.executeQuery(sq);
		while(rs.next())
		{
			System.out.println("\t" + rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) );
		}
	}
	catch(Exception e)
	{
		System.out.println("Message: " + e);
	}
	%>

	<%= "Message: " + status + " record(s) inserted" %>

</body>
</html>