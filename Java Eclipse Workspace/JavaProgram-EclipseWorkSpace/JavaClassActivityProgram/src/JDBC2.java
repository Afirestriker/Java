
/*
 * 2. Write a JDBC program to display the name of the movies starting with the alphabet ‘A’.
 */

import java.sql.*;

public class JDBC2
{
	public static void main(String args[])
	{
		System.out.println("Movie Data Table \n");
		
		try
		{
			//Register with driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprogram", "root", "root");
			
			//Statement
			Statement st = con.createStatement();
			
			//ResultSet
			ResultSet rs = st.executeQuery("select movienumber, moviename from movie where moviename like 'A%' ");
			
			while(rs.next())
			{
				System.out.println(" " + rs.getInt(1) + " | " + rs.getString(2) + " |");
			}
		}
		catch(Exception e)
		{
			System.out.println("Message " + e);
		}
	}
}