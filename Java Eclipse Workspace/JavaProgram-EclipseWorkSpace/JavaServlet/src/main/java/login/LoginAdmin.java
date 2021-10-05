package login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LoginAdmin")
public class LoginAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username").trim();
		String password = request.getParameter("password").trim();
		
		if(username == null || username.equals("") || password == null || password.equals(""))
		{
			out.print("Please Enter Username and Password" + "<br> <br> <hr>");
			RequestDispatcher rd = request.getRequestDispatcher("/HTML/login.html");
			rd.include(request, response);
		}
		else if(username.equals("admin") && password.equals("admin"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeAdmin");
			rd.forward(request, response);
		}
		else
		{
			out.print("Wrong Username and Password" + "<br> <br> <hr>");
			RequestDispatcher rd = request.getRequestDispatcher("/HTML/login.html");
			rd.include(request, response);
		}
		
		out.close();

	} //doPost() close
} //public class close
