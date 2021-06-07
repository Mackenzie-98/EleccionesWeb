package co.ufps.elecciones.controller;

import co.ufps.elecciones.dao.*;
import co.ufps.elecciones.entities.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/")

public class VotanteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public VotanteController() {
        super();
    }
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Est� entrando");
		Tipo_DocumentoDAO tdd = new Tipo_DocumentoDAO();
		EleccionDAO ed = new EleccionDAO();
		
		List<Eleccion> elecciones = ed.findAll();		
		List<Tipo_Documento> tiposdocumento = tdd.findAll();
		
		request.setAttribute("elecciones", elecciones);
		request.setAttribute("tiposdocumento", tiposdocumento);
		request.getRequestDispatcher("vistas/registro_votante.jsp").forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String tipodocumento = request.getParameter("tipodocumento");
		String estamento = request.getParameter("estamento");
		String nombre = request.getParameter("nombre");
		String documento = request.getParameter("documento");
		String email = request.getParameter("email");
		String proceso = request.getParameter("proceso");
					
		EleccionDAO cd = new EleccionDAO();
		Tipo_DocumentoDAO tdd = new Tipo_DocumentoDAO();
		VotanteDAO vd = new VotanteDAO();
		
		Eleccion c = cd.findById(Integer.parseInt(proceso));		
		Tipo_Documento td = tdd.findById(Integer.parseInt(tipodocumento));
		
		Votante v = new Votante(nombre, email, documento);
		v.setTipodocumento(td);
		v.setEleccion(c);
		vd.insert(v);
		
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("Votante Registrado Correctamente");
		}
=======
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
>>>>>>> 05a92848f7d3451c7753b28568bd12876bc06093
	}
}