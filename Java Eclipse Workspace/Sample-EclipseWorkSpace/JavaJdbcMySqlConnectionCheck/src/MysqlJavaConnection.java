
/*
 * MySql database connectivity process
 * Step 1: Download MySql connector java Jar file and add it into project libraries
 * 			Ex: mysql-connector-java-8.0.25.jar (version depend on time)
 * Step 2: Now follow the JDBC connectivity steps
 * 			1. Register the driver class
 * 				Class.forName("com.mysql.cj.jdbc.Driver");
 * 			2. Create Connection
 * 				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseName", "UserName", "Password");
 * 			3. Create Statement
 * 				Statement stmt=con.createStatement();
 * 			4. Execute Query
 * 				ResultSet rs=stmt.executeQuery("Sql-Query-here");
				while(rs.next())
					System.out.println( rs.getInt(1) + " " + rs.getString(2) );
 * 			5. Close connection
 * 				con.close();
 * 
 * NOTE: In every Java - MySql connectivity steps,
 *       only change is in connection object i.e Mysql database-name, user-name and password
 *       and the executable query is also change based on requirement, rest all the code remains same.
 */

import java.lang.*;
import java.sql.*;  

public class MysqlJavaConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		try
		{  
			//Registor Driver
			Class.forName("com.mysql.cj.jdbc.Driver");  

			//Connection interface
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/giraffe","root","root");  
			//here giraffe is database name, root is username and second root is password  
			
			//Statement interface
			Statement stmt=con.createStatement();  
			
			//ResultSet
			ResultSet rs=stmt.executeQuery("select * from employees");  
			
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			
			//Close connection
			con.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
		
	}

}
