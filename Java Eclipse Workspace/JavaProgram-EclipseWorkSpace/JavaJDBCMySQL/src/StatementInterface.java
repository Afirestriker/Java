
import java.sql.*;

public class StatementInterface {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprogram", "root", "root");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("Select * from movie");
			
			while(rs.next())
			{
				System.out.println(" " + rs.getInt(1) + " " + rs.getString(2) );
			}
		
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}

	}

}
