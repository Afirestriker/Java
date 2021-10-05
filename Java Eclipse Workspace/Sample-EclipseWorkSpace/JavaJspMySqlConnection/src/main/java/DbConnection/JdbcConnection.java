package DbConnection;

import java.sql.*;

public class JdbcConnection {
	
	public static final String url = "jdbc:mysql://localhost:3306/";
	public static final String database = "hireupv1";
	public static final String user = "root";
	public static final String pass = "root";
	
	public static Connection getConnection()
	{
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url + database, user, pass);
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
		
		return con;
	}
	
	
}
