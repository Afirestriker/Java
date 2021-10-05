
/*
 * Microsoft Access Database connectivity using UCanAccess Driver
 * Step 1: Download UCanAccess Jars and add into project libraries
 * 			ucanaccess-5.0.1.jar
 * 			commons-lang3-3.8.1.jar
 * 			commons-logging-1.2.jar
 * 			hsqldb-2.5.0.jar
 * 			jackcess-3.0.1.jar
 * Step 2: Now follow the JDBC connectivity steps
 * 			1. Register the driver class
 * 			2. Create Connection
 * 			3. Create Statement
 * 			4. Execute Queries
 * 			5. Close connection
 * NOTE: In every Java - MS Access java code, only the database path will be 
 * 		 change and Query statement, other all steps and code remain same.
 */

import java.sql.*;

public class MsAccessJavaConnection {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Hello Java");
			
			//Registering the driver
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			
			//Connection to Database
			String databasePath = "E:\\a coding\\Java Programming\\Eclipse Workspace\\MS Access Databases\\CodeDatabase.accdb";
			String url = "jdbc:ucanaccess://" + databasePath;
			
			Connection con = DriverManager.getConnection(url);  
			
			//Statement
			Statement st = con.createStatement();  

			//Execute Query
			ResultSet rs = st.executeQuery("select * from Employee");  
			    
			   while(rs.next())
			   {  
			    System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
			   }
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
		
	} //close main

} //close class
