
/*
 * Slip 12 Q1. Write a jdbc program to display all the courses. Course( cno, cname, duration, fees)
*/

import java.sql.*;

public class Sp12Q1 {
	
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaslip", "root", "root");
			
			Statement st = con.createStatement();
			String sq = "SELECT * FROM course";
			
			ResultSet rs = st.executeQuery(sq);
			System.out.println("\nDisplaying all records of Couse table (cno, cname, duration, fees)");
			while(rs.next())
			{
				System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			
		} catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
}
