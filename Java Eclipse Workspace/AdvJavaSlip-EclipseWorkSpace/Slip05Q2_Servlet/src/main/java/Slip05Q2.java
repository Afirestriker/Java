
/* Slip05 2. Write a servlet which displays whether the session is new or old, also display “How are
you?” message to the user*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Slip05Q2")
public class Slip05Q2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		if(session.isNew())
		{
			out.print("Session is new");
		}
		else
		{
			out.print("Sessio is old");
		}
		out.print("<br> <br> <h3> How Are You? </h3> ");

	}
}
