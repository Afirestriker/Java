package cookies;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Cookie")
public class Cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n = request.getParameter("name");
		out.print("<br> <h1> Welcome " + n +"  </h1>  ");
		
		//create cookie object and add cookie
		
		
		//creating submit button  
	    out.print("<form action='cookie2'>");
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");
		
	} // doGet() close

} // public class close
