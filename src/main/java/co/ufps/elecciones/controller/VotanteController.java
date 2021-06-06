package co.ufps.elecciones.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/")

public class VotanteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public VotanteController() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String nombre = request.getParameter("nombre");
//		String documento = request.getParameter("documento");
//		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
			out.println("<html><body");
			out.println("<h1> Hello world</h1>");
			out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession(true);
//		String nombre = request.getParameter("nombre");
//		String documento = request.getParameter("documento");
//		String email = request.getParameter("email");
//		
		PrintWriter out = response.getWriter();
		out.println("<html><body");
		out.println("<h1> Hello world</h1>");
		out.println("</body></html>");
	}
}