package co.ufps.elecciones.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.ufps.elecciones.dao.*;
import co.ufps.elecciones.entities.*;

@WebServlet("/CandidatoController")
public class CandidatoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CandidatoController() {
        super();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		EleccionDAO ed = new EleccionDAO();
		List<Eleccion> elecciones = ed.findAll();
		
		request.setAttribute("elecciones", elecciones);
		request.getRequestDispatcher("vistas/registro_candidato.jsp").forward(request, response);
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String documento = request.getParameter("documento");
		String apellido = request.getParameter("apellido");
		String proceso = request.getParameter("proceso");
		
		EleccionDAO ed = new EleccionDAO();
		CandidatoDAO cd = new CandidatoDAO();
		
		Eleccion e = ed.findById(Integer.parseInt(proceso));		
		Candidato c = new Candidato(documento, nombre, apellido,e);
		
		c.setEleccion(e);		
		cd.insert(c);
		
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("Votante Registrado Correctamente");
		}
	}
}