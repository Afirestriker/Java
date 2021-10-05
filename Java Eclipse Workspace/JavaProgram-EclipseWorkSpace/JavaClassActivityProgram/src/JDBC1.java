
/*
 * 1. Write a JDBC program to display the name of the books published in the year 2000.
 */

import java.sql.*;

public class JDBC1 {

	public static void main(String[] args) {

		try
		{
			System.out.println("Book Table Data \n");
			
			//Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprogram", "root", "root");
			
			//Statement
			Statement st = con.createStatement();
			
			//ResutlSet
			ResultSet rs = st.executeQuery("select booknumber, bookname, bookpublish_date from book where year(bookpublish_date) = 2000");
			
			while(rs.next())
			{
				System.out.println(" " + rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getDate(3) + " |");
			}
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
		
	}

}
