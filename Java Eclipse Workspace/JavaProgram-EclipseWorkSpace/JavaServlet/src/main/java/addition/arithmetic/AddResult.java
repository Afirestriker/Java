package addition.arithmetic;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/AddResult")
public class AddResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<br><hr>");
		out.print("Number 1: " + request.getParameter("number1"));
		
		out.print("<br><br>");
		out.print("Nubmer 2: " + request.getParameter("number2"));
		
		out.print("<br><br>");
		out.print("Addition: " + request.getParameter("addition"));
		
		out.print("<br><hr>");
	}

}
