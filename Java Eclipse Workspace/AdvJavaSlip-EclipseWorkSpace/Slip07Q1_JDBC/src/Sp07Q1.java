
/*
 * Slip 07 Q1. Write a jdbc program to display all records from policy table (pno, policyname, duration)
*/

import java.sql.*;

public class Sp07Q1 {

	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaslip", "root", "root");
			
			Statement st = con.createStatement();
			String sq = "SELECT * FROM policy";
			ResultSet rs = st.executeQuery(sq);
			
			System.out.println("\nDiplaying all record(s) of policy table (policy number, name, and Duration) \n");
			while(rs.next())
			{
				System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
}
