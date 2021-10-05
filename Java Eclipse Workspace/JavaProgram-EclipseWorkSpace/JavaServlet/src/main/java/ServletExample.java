
//Introduction to servlet, Doing html in java servlet

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head> <title> ServletExample Page </title> </head>");
		out.print("<body>");	
			out.print("Servlet Example Page");
		out.print("</body>");
	}

}
