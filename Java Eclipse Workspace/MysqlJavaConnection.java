
import java.sql.*;  

public class java{

	public static void main(String[] args) {

			Class.forName("com.mysql.cj.jdbc.Driver");  

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil","root","password");  
			
			Statement st=con.createStatement();  
			
			ResultSet rs=st.executeQuery("select * from employee");  
			
			while(rs.next())  
				System.out.println(rs.getInt(1)+" "+rs.getString(2));  
			
			con.close();  
	}
}
