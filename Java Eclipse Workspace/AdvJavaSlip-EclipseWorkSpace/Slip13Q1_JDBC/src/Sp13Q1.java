
/*
 * 1. Write a Jdbc program which accepts details for book (bno, bookname, price) and stores 
      this data in the table
*/

import java.sql.*;
import java.io.*;

//Class Book with method acceptBookDetail(), displayBookDetail()
class book{
	
	int book_no, book_price;
	String book_name;
	
	book(){
		book_no = 0;
		book_price = 0;
		book_name = null;
	}
	
	public void acceptBookDetail()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("\nEnter Book Details: ");
			System.out.print("Book Number: ");
				book_no = Integer.parseInt(br.readLine());
			System.out.print("Book Name: ");
				book_name = br.readLine();
			System.out.print("Book Price: ");
				book_price = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	} //acceptBookDetail() close

	public void displayBookTable(Connection con) {
		
		try {
			Statement st = con.createStatement();
			String sq = "SELECT * FROM book";
			ResultSet rs = st.executeQuery(sq);
			
			System.out.println("\nDisplaying all the record(s) of Book table");
			while(rs.next())
			{
				System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
			}
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
			
	} //displayBookTable() close
	
} //class book close

public class Sp13Q1 {
	
	static int newRowCount; //In java, Static local variable are not allowed, hence declared as static class variable
	
	public static void main(String args[])
	{
		book b1 = new book();
		
		try
		{
					
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaslip", "root", "root");
			
			b1.acceptBookDetail();
			
			String sq = "INSERT INTO book VALUES (?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(sq);
			pst.setInt(1, b1.book_no);
			pst.setString(2, b1.book_name);
			pst.setInt(3, b1.book_price);
			
			newRowCount = pst.executeUpdate();
			
			System.out.println("\n\t" + newRowCount + " row(s) add successfully");
			
			b1.displayBookTable(con);
			
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
		
	} //main() close

	
} //public class close
