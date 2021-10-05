
/*
 * Slip 05 Q1. Write a jdbc program to display all the employees getting salary below 28000
*/

import java.sql.*;

public class Sp05Q1 {

	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaslip", "root", "root");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM emp where emp_salary < 28000");
			
			System.out.println("\nDisplaying all record(s) from employee table where salary below 28000 \n");
			while(rs.next())
			{
				System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	
	} //main() close
} //class close
