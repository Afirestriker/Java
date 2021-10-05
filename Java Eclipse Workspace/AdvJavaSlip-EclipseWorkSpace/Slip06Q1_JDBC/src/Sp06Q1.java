
/*
 * Slip 06 Q1. Write a jdbc program to find and display given record from emp table
   (eno,ename,design,sal).
*/

import java.sql.*;
import java.io.*;

public class Sp06Q1 {
	
	static int menuItem()
	{
		int choice=0;
		try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Select criteria for search: ");
			System.out.println("1. By Employe Number \n2. By Employee Name \n3. By Employee Designation");
			System.out.print("\tEnter your choice: ");
			choice = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
			
		return choice;
	} //menu() close
	
	static void performQuery(Connection conn, int empNo, String empName, String empDesig)
	{
		try 
		{
			if(conn != null)
			{
				if(empNo > 0)
				{
					String sq = "SELECT * FROM emp WHERE emp_number = ?";
					PreparedStatement pst = conn.prepareStatement(sq);
					pst.setInt(1, empNo);
					displayQuery(pst);
				}
				
				if(empName != "null")
				{
					String sq = "SELECT * FROM emp WHERE emp_name = ?";
					PreparedStatement pst = conn.prepareStatement(sq);
					pst.setString(1, empName);
					displayQuery(pst);
				}
				
				if(empDesig != "null")
				{
					String sq = "SELECT * FROM emp WHERE emp_designation = ?";
					PreparedStatement pst = conn.prepareStatement(sq);
					pst.setString(1, empDesig);
					displayQuery(pst);
				}
			}
			else
				System.out.println("\nConnection Establishment errro \n");
			
		}catch(Exception e)
			{
				System.out.println("Message: " + e);
			}
		
	} //performQuery() close
	
	static void displayQuery(PreparedStatement pstm)
	{
		try {
			ResultSet rs = pstm.executeQuery();
						
			System.out.println("\nDisplaying Employee records(s) that matches the search");
			while(rs.next())
				{
					System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
				}
			
			if(rs.next() == false)
			{
				System.out.println("\nNo More/Such data found, Closing Program...");
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
		
	} //displayQuery() close
	
	
	public static void main(String args[])
	{
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaslip", "root", "root");
			
			int criteria = menuItem();
			int emp_no=0;
			String emp_name="null", emp_desig="null";
			
			
			if(criteria == 1)
			{
				System.out.print("\nEnter emp number: ");
				emp_no = Integer.parseInt(br.readLine());
				performQuery(con, emp_no, emp_name, emp_desig);
				
			}
			else if (criteria == 2)
			{
				System.out.print("\nEnter emp Name: ");
				emp_name = br.readLine();
				performQuery(con, emp_no, emp_name, emp_desig);
			}
			else if (criteria == 3)
			{
				System.out.print("\nEnter emp Designation: ");
				emp_desig = br.readLine();
				performQuery(con, emp_no, emp_name, emp_desig);
			}
			else
			{
				System.out.print("\nWrong Number entered...Closing Program....");
				System.exit(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
		
	} //main() close
}  //class close
