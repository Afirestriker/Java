
/* Slip01 Q2. Write a servlet which displays session id and current date and time. 
 */

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/servlet1")
public class Slip01Q2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		out.print("Session ID: " + "<b>"+ session.getId() +"</b>");
		
		Date dt = new Date();
		out.println("<br><br> Current Date and Time: " + dt.toString() + "<hr>");
		
		out.close();
		
	} //doGet() method
	
} //public class close
