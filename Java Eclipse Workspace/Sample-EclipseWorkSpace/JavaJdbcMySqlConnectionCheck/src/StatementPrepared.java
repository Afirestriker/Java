
import java.sql.*;
import java.util.*;

public class StatementPrepared {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name, city;
		try
		{
			//Registor the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/giraffe", "root", "root");
			
			//Statement
			String qry = "insert into employees(Ename, Ecity) values (?, ?)";
			PreparedStatement pst = con.prepareStatement(qry);

			System.out.print("Enter Employee Name: ");
			name = scan.nextLine();
			System.out.print("Enter Employee City: ");
			city = scan.nextLine();
			
			pst.setString(1, name);
			pst.setString(2, city);
			
			int rowCount = pst.executeUpdate();
			System.out.println(" " + rowCount + " Records Inserted");
			
			//Displaying whole employees table
			Statement st = con.createStatement();
			//ResultSet
			ResultSet rs = st.executeQuery("SELECT * FROM employees");
			System.out.println(" \n Displaying the whole table");
			while(rs.next())
			{
				System.out.println(" " + rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));
			}
		
			//Close Connection
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}

}
