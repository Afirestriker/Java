
/*
 * Slip 04 Q1.Write a jdbc program to delete given record from product table (pno,pname,price).
   (input as pname)
*/
import java.sql.*;
import java.io.*;

public class Sp04Q1 {

	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pname;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaslip", "root", "root");
			
			System.out.println("\nSpecify Product name to delete matching record(s) from product table");
			System.out.print("Enter Product Name: ");
			pname = br.readLine();
			
			String sq = "delete from product where product_name = ?";
			PreparedStatement pst = con.prepareStatement(sq);
			pst.setString(1, pname);
			
			
			int rowAffected = pst.executeUpdate();
			if(rowAffected > 0)
			{
			System.out.println("\t" + rowAffected + " Row(s) Found Matching & Deleted");
			}
			else
				System.out.print("\t No Record found with Product name: " + pname);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
	
}
