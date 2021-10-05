
/*
 * Slip08 Q1. Write a jdbc program which displays movie details for given movie
	  (mvno,mvname,releaseyear).
*/


import java.sql.*;
import java.io.*;

public class Sp08Q1 {

	static Connection jdbcMysqlConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaslip", "root", "root");
			
		}
		catch(Exception e)
		{
			System.out.println("\nMessage: " + e);
		}
		
		return con;
	} //jdbcMysqlConnection() close
	
	static int menuItem()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice=0;
		try {
			System.out.println("\nSelect search criteria: ");
			System.out.println("1. Movie Number \n2. Movie Name \n3. Movie Release Year \n");
			System.out.print("\tEnter Your choice: ");
			choice = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println("\nMessage: " + e);
		}
		
		switch(choice)
		{
			case 1:
			case 2:
			case 3:
				System.out.println("\tIn Progress...");
				break;
		default:
				System.out.println("\nWrong choice...Closing Program...");
				System.exit(1);
				break;
		}
		
		return choice;		
	} //menuItem() close
	
	static void preparedStatementQuery(Connection con, int ch)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mvno, mv_release_year;
		String mvname;
		String sq;
		try
		{
			if(ch==1)
			{
				System.out.print("\nEnter Movie Number: ");
				mvno = Integer.parseInt(br.readLine());
				sq = "SELECT * FROM movie WHERE movie_number = ?";
				PreparedStatement pst = con.prepareStatement(sq);
				pst.setInt(1, mvno);
				executePreparedStatement(pst);
			}
			else if(ch==2)
			{
				System.out.print("\nEnter Movie Name: ");
				mvname = br.readLine();
				sq = "SELECT * FROM movie WHERE movie_name = ?";
				PreparedStatement pst = con.prepareStatement(sq);
				pst.setString(1, mvname);
				executePreparedStatement(pst);
			}
			else if(ch==3)
			{
				System.out.print("\nEnter Movie Release Year (YYYY): ");
				mv_release_year = Integer.parseInt(br.readLine());
				sq = "SELECT * FROM movie WHERE movie_release_year = ?";
				PreparedStatement pst = con.prepareStatement(sq);
				pst.setInt(1, mv_release_year);
				executePreparedStatement(pst);
			}
			else
			{
				System.out.println("\nWrong choice...Closing Program...");
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}

	} //preparedStatementQuery() close
	
	static void executePreparedStatement(PreparedStatement pst)
	{
		try {
			ResultSet rs = pst.executeQuery();
			System.out.println("\nDisplaing record(s) of movie table (mvno, mvname, release year), that matches the search: \n");
			while(rs.next())
			{
				System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
			}
			
			if(rs.next() != true)
				System.out.println("\nNo more/such data");
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
			
	} //executePreparedStatement() close
	
	public static void main(String args[])
	{
		try {
			Connection con = jdbcMysqlConnection();
			int ch = menuItem();
			preparedStatementQuery(con, ch);
						
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
}
