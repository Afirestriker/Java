
import java.sql.*;
import java.io.*;

public class EmpTable {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/giraffe", "root", "root");
			
			//Statement interface
			System.out.println("Print whole employees table \n");
			String sql = "Select * from employees";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				
				System.out.println(" " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) );
			}

			//PreparedStatement interface
			System.out.println("Prepared statement interface \n");
			System.out.println("Enter employee ID: ");
			int eid = Integer.parseInt(br.readLine());
			
			String pstsq = "Select * from employees where Eid=?";
			PreparedStatement pst = con.prepareStatement(pstsq);
			pst.setInt(1, eid);
			
			ResultSet rs1 = pst.executeQuery();
			while(rs1.next()) {
				System.out.println(" " + rs1.getInt(1) + " " + rs1.getString(2) + " " + rs1.getString(3));
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Mesage: " + e);
		}
		

	}

}
