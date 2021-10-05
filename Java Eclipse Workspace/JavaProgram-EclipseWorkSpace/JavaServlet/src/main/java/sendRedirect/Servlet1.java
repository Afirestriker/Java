
// HTML/sendRedirect.html calls --> Servlet1.java

package sendRedirect;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("This is servlet1.java");
		
		response.sendRedirect("Servlet2");
		
	} //doGet() close
	
} //public class Servlet1 close
