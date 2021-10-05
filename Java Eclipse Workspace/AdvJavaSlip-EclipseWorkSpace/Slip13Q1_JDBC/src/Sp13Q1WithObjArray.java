
import java.sql.*;
import java.io.*;

//Class Book with method acceptBookDetail(), displayBookDetail()
class book1{
	
	static int total_book=0;
	int book_no, book_price;
	String book_name;
	
	book1(){
		book_no = 0;
		book_price = 0;
		book_name = null;
	}
	
	public void acceptBookDetail()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		total_book++;
		try {
			System.out.println("\nEnter Book " + total_book + " Detail: ");
			System.out.print("Book Number: ");
				book_no = Integer.parseInt(br.readLine());
			System.out.print("Book Name: ");
				book_name = br.readLine();
			System.out.print("Book Price: ");
				book_price = Integer.parseInt(br.readLine());
				
			if(book_no == 0 || book_price==0 || book_name == null || book_name == "")
			{
				System.out.println("Invalid data entered...Cannot Add this data...");
			}
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	} //acceptBookDetail() close

	static public void displayBookTable(Connection con) {
		
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


public class Sp13Q1WithObjArray {

	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		
		try
		{
					
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaslip", "root", "root");
			
			System.out.print("\nSpecify number of books to add: ");
			n = Integer.parseInt(br.readLine());
		
			book1 b1[] = new book1[n];
		
			for(int i=0; i<b1.length; i++)
			{
				b1[i] = new book1();
				b1[i].acceptBookDetail();
				
				String sq = "INSERT INTO book VALUES (?, ?, ?)";
				PreparedStatement pst = con.prepareStatement(sq);
				pst.setInt(1, b1[i].book_no);
				pst.setString(2, b1[i].book_name);
				pst.setInt(3, b1[i].book_price);
				
				int newRowCount = pst.executeUpdate();
				System.out.println("\n\t" + newRowCount + " row add successfully");
			} //for loop close
			
			System.out.println("\n\tTotal " + n + " row(s) add successfully");
			
			book1.displayBookTable(con);
			
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
		
	} //main() close
	
} //class Sp13Q1WithObjArray close
