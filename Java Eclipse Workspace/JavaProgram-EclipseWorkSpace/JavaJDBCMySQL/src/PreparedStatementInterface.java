
import java.sql.*;
import java.util.*;

public class PreparedStatementInterface {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String Ename, Ecity;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprogram", "root", "root");
			
// Create Table query	
			String createTableQuery = "create table employee ( Eno int not null primary key auto_increment, Ename varchar(20), Ecity varchar(20) )";
			Statement st = con.createStatement();
			st.executeUpdate(createTableQuery);
			System.out.println("Table employee Created Successfully! \n");

// Insert Data into table
			System.out.println("\nInserting Data into Employe");
			
			String insertQuery = "insert into employee (Ename, Ecity) values (?, ?)";
			PreparedStatement pst = con.prepareStatement(insertQuery);
			
			System.out.print("\nEnter Employee Name: " );
			Ename = scan.nextLine();
			pst.setString(1, Ename);
			
			System.out.print("Enter Employee City: ");
			Ecity = scan.nextLine();
			pst.setString(2, Ecity);
			
			int rowCount = pst.executeUpdate();
			System.out.println("\nTotal row entered: " + rowCount);

// Display whole table
			String selectQuery = "select * from employee";
			Statement st1 = con.createStatement();
			ResultSet rs = st1.executeQuery(selectQuery);
			
			while(rs.next())
			{
				System.out.println(" " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
		finally
		{
			scan.close();
		}
	}
}
