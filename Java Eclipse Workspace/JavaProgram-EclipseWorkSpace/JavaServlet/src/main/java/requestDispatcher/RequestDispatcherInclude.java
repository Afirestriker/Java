package requestDispatcher;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/RequestDispatcherInclude")
public class RequestDispatcherInclude extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("This is RequestDispatcherInclude servlet class <br><br>");
		
		RequestDispatcher rd = request.getRequestDispatcher("Message");
		rd.include(request, response);
		
		out.print("<br><br> End of RequestDispatcherInclude servlet class");
		
	} // doGet() close
} // public class close
