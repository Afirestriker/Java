
/* Slip07 2. Write an HTML page which accepts 2 numbers. Submit these numbers to the servlet and
display their multiplication and division */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/calculation")
public class Calculation extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try
		{
						
			int num1 = Integer.parseInt(request.getParameter("number1"));
			int num2 = Integer.parseInt(request.getParameter("number2"));
			
			if(num2 != 0)
			{
				int multi = num1*num2;
				double div = (double)num1 / (double)num2;
				
				out.print("<html>");
				out.print("<head> <title> Calculation </title> </head>");
				out.print("<body>");
					out.println("<hr> <br>");
					
					out.print("Multiplication of " + num1 + " & " + num2 + ": " + multi);
					out.print("<br><br>");
					out.print("Division of " + num1 + " & " + num2 + ": " + div);
					
					out.println("<br> <hr>");
				out.print("</body> </html>");
			}
			else
			{
				out.print("Multiplication is Zero, since Zero multiply by anynumber is alwasy zero");
				out.print("<br> <br>");
				out.print("Division not possible, since Denominator value is " + num2);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	
	}
	
	
	
}