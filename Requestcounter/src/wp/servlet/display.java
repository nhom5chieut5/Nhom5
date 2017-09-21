package wp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class display
 */
@WebServlet("/display")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public display() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer counter =(Integer) getServletContext().getAttribute("counter");
				
			
				PrintWriter out =response.getWriter();
				response.setContentType("text/html");
				out.println("<html><head><title>Request Counter</title></head><body>");
				out.println("<h2>You are visitor # " + counter + ".</h2>");
				out.println("</body></html>");

	}

}
