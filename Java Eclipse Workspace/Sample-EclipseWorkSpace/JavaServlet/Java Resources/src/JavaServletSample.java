

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaServletSample
 */
@WebServlet("/JavaServletSample")
public class JavaServletSample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html> <body>");
		out.print("<h1> Hello Servelt program </h1>");
		out.print("</body> </html>");
		
		
	} //doGet() method close

}
