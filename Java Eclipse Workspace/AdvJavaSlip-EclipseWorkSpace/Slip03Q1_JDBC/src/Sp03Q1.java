
/*
 * Slip 03 Q1.Write a jdbc program to insert a record into emp table (eno,ename,design,salary).
*/

import java.sql.*;
import java.util.*;

public class Sp03Q1 {
	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaslip", "root", "root");
			
			int emp_no , emp_salary;
			String emp_name, emp_designation;
			
			System.out.println("\nEnter Employee details: \n");
			System.out.print("Enter Employee Number: ");
				emp_no = scan.nextInt(); scan.nextLine();
			System.out.print("Enter Employee Name: ");
				emp_name = scan.nextLine();
			System.out.print("Enter Employee Designation: ");
				emp_designation = scan.nextLine();
			System.out.print("Enter Employee Salary: ");
				emp_salary = scan.nextInt(); scan.nextLine();
				
			String sq = "insert into emp values (?, ?, ?, ?);";
			PreparedStatement pst = con.prepareStatement(sq);
			pst.setInt(1, emp_no);
			pst.setString(2, emp_name);
			pst.setString(3, emp_designation);
			pst.setInt(4, emp_salary);
			
			int rowAffected = pst.executeUpdate();
			System.out.println("\n " + rowAffected + " Row(s) added successfully");
			
			System.out.println("\nDisplaying all records of Employee table (Eno, Ename, Edesig, Esalary)\n");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM emp");
			while(rs.next())
			{
				System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error in inserting data. Try again! \n\n");
			System.out.println("Message: " + e);
		}
		finally
		{
			scan.close();
		}

	}

}
