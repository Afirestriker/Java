
/*
 * Slip16 1. Write a jdbc program to accept customer number through command line arguments and
      display the corresponding details ( cname, city).
*/

import java.sql.*;

public class Sp16Q1 {
	
	public static void main(String args[])
	{
		try
		{
			int num[] = new int[args.length];
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaslip", "root", "root");
			

			System.out.println("\nDisplaying record(s) of customer table (Cname, Ccity)");
			
			for(int i=0; i<args.length; i++)
			{
				
				num[i] = Integer.parseInt(args[i]);
				
				String sq = "SELECT * FROM customer WHERE customer_number = ?";
				PreparedStatement pst = con.prepareStatement(sq);
				pst.setInt(1, num[i]);
				
				ResultSet rs = pst.executeQuery();
				
				while(rs.next())
				{
					System.out.println("\tName: " + rs.getString(2) + "\tCity: " + rs.getString(3));
				}
			} //for loop close
			System.out.print("\nTable completed");
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}

}
