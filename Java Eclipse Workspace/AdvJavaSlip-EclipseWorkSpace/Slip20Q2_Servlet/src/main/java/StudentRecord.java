
/* Slip20 2. Write a servlet which displays all the records from student table (rno, sname, course).*/

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/StudentRecord")
public class StudentRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaslip", "root", "root");
			
			String selectQuery = "SELECT * FROM student";
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(selectQuery);
			
			out.print("<html>");
			out.print("<head> <title> Student Table </title> </head>");
			out.print("<body>");
			
			out.print("<br> Student Table <br><hr>");
			out.print("<table>");
			out.print("<tr> <th>No</th> <th>Name</th> <th>Gender</th>  </tr>");
				while(rs.next())
				{
					out.print("<tr> "
							+ "<td>" + rs.getInt(1) + "</td>"
							+ "<td>" + rs.getString(2) + "</td>"
							+ "<td>" + rs.getString(3) + "</td>"
							+ " </tr>");
				}
			out.print("</table>");
			out.print("</body> </html>");
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	
	} //doPost() method close
}
