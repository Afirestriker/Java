
/*Slip13 2. Write one HTML page which accepts a number. Send this number to a servlet which
displays factorial of this number*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Factorial")
public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int num = Integer.parseInt(request.getParameter("number"));
		int temp=num, fact=1;
		while(temp > 0)
		{
			fact = fact * temp;
			temp--;
		}
		
		out.print("<html>");
		out.print("<head> <title> Factorial of" + num + "</title> </head>");
		out.print("<body>");
		
			out.print("<br><hr>");
			out.print("<h3> Factorial of </h3>" + "<h2>" + num + ":</h2> " + "<h1>" + fact + "</h1>");
		
		out.print("</body> </html>");
		
	}
}
