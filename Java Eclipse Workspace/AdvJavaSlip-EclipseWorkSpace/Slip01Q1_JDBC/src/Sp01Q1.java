
/*
 * Slip01 Q1.Write a jdbc program to display all records from emp (eno,ename,salary) table.
 */

import java.sql.*;

public class Sp01Q1 {

	public static void main(String[] args) {
		System.out.println("Displaying All The Recordes Of Employee Table \n");

		try {
			
			// Register with driver	
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaSlip", "root", "root");
			
			//statement
			Statement st = con.createStatement();
			
			//ResultSet
			ResultSet rs = st.executeQuery("select * from emp");
			
			System.out.println("Eno  Ename   Salary \n-------------------------------");
			while(rs.next())
			{
				System.out.println(" " + rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getInt(4));
			}
			
			rs.close();
			st.close();
			con.close();

		} 
		catch (Exception e) {
			System.out.println("Message: " + e);
		}

	}

}
