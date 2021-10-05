
/*Slip02 Q2.Write a servlet which accept 2 numbers and displays their addition and subtraction.
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

//NubmerForm.html --> Arithmetic.java servlet

@WebServlet("/arithmetic")
public class Arithmetic extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		
		int add = num1 + num2;
		int sub = num1 - num2;
		
		out.println("<hr>");
		out.println("<br> Addition of " + num1 + " & " + num2 + ":  " + add);
		out.println("<br>");
		out.println("<br> Substraction of " + num1 + " & " + num2 + ":  " + sub);
		out.println("<hr>");
	}
	
}
