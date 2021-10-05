
//Count number of times, the same page is visited in one servlet/server life cycle

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PageVisitCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int counter=0;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		counter++;
		res.setContentType("text/html");		
		PrintWriter out = res.getWriter();
		
		out.print("Value of Counter: " + counter);
		
		out.close();
	}

}
