package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testtttttt
 */
@WebServlet("/testtttttt")
public class testtttttt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p = request.getParameter("Processor");
		String a = request.getParameter("Accessories");
		String o = request.getParameter("op");
		
		
		request.setAttribute("p",p );
		request.setAttribute("a",a );
		request.setAttribute("o",o );
		request.getRequestDispatcher("test1.jsp").forward(request, response);
	}

}
