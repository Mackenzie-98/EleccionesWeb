package co.ufps.elecciones.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import co.ufps.elecciones.dao.*;
import co.ufps.elecciones.entities.*;
import jakarta.servlet.RequestDispatcher;

@WebServlet("/CandidatoController")
public class CandidatoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CandidatoController() {
        super();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String nombre = request.getParameter("nombre");
		String documento = request.getParameter("documento");
		String apellido = request.getParameter("apellido");
		String proceso = request.getParameter("proceso");
		
		EleccionDAO elecciondao = new EleccionDAO();
		CandidatoDAO candidatodao = new CandidatoDAO();
		
		Eleccion eleccion = elecciondao.findById(Integer.parseInt(proceso));		
		Candidato candidato = new Candidato(documento, nombre, apellido, eleccion);
		candidato.setEleccion(eleccion);		
		
		try{
			candidatodao.insert(candidato);
			RequestDispatcher rd = request.getRequestDispatcher("Vistas/index.jsp");
			rd.forward(request, response);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}