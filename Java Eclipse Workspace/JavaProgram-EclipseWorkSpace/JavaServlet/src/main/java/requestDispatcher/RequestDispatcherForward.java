
package requestDispatcher;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/RequestDispatcherForward")
public class RequestDispatcherForward extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("This is RequestDispatcherForward servlet");
		
		RequestDispatcher rd = request.getRequestDispatcher("Message");
		rd.forward(request, response);
		
		out.print("End of RequestDispatcherForward servlet class");
		
	} // doGet() close
	
} // public class close