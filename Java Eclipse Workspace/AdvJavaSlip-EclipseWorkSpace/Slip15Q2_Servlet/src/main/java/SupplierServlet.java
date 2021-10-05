
/* Slip15 2. Write one HTML page which accepts supplier details(sno, supname, mobno). Insert
this record using a servlet.*/

//Run EnterSupplierDetail.html file

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Supplier")
public class SupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int sno = Integer.parseInt(request.getParameter("sno"));
		String sname = request.getParameter("sname");
		String smob = request.getParameter("smob");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaslip", "root", "root");
			
			String insertQuery = "INSERT INTO supplier VALUES (?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(insertQuery);
			pst.setInt(1, sno);
			pst.setString(2, sname);
			pst.setString(3, smob);
			
			int status = pst.executeUpdate();
			
			pst.close();
			con.close();
			
			
			out.print("<html>");
			out.print("<head> <title> Insert Supplier Detail </title> </head>");
			out.print("<body>");
			
				if(status > 0)
					out.print("<h3> " + status + " Supplier data Succesfully Inserted </h3>");
				else
					out.print("<h3> Error," + status + " Supplier data Inserted </h3>");
				
			out.print("</body> </html>");
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e);
		}
		
	}
}
