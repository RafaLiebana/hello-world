package practica1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HolaMundo
 */
@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaMundo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out;
		out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head><title>Ejemplo Practica 1</title></head>");
		out.println("<body>");
		out.println("<h1>Hola Mundo</h1>");
		out.println("</body></html>");
		
	
		 Enumeration headerNames = request.getHeaderNames();
		    while(headerNames.hasMoreElements()) {
		      String headerName = (String)headerNames.nextElement();
		      out.println("<TR><TD>" +headerName);
		      out.println("    <TD>" +request.getHeader(headerName));
		    }
		
	}

}
