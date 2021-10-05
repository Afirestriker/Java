
/*
 * Write a JDBC program in java to update an address of given customer(cid,cname,address) 
   and display updated details. (take customer id and new address)
*/

import java.sql.*;
import java.io.*;

public class CustomerAddressUpdate {

	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cid;
		String caddress;
		int c=1;
		boolean retry=true;
		
		while(retry)
		{
			try
			{
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaprogram", "root", "root");
				
				System.out.print("\nEnter customer ID: ");
				cid = Integer.parseInt(br.readLine());
				
				System.out.print("Enter New Address: ");
				caddress = br.readLine();
				
				String updateQuery = "UPDATE customer SET customer_address=? WHERE customer_id=?";
				PreparedStatement pst = con.prepareStatement(updateQuery);
				pst.setString(1, caddress);
				pst.setInt(2, cid);
				
				int pstStatus = pst.executeUpdate();
				if(pstStatus > 0)
				{
					System.out.println("\tCustomer Address updated successfully");
					
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("SELECT * FROM customer");
					
					System.out.println("Displaying all the records of customer table: \n");
					while(rs.next())
					{
						System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
					}
				}
				else
				{
					System.out.println("\t Error in updating address");
				}
				
				System.out.print("\n\n Enter 1 to retry or 0 to exit: ");
				c = Integer.parseInt(br.readLine());
				
				if(c != 1)
				{
					retry = false;
					System.out.println("\tTerminated...");
				}
			}
			catch(Exception e)
			{
				System.out.println("Message: " + e);
			}
			
		}//while loop close
		
	} //man() close
	
} //public class close
