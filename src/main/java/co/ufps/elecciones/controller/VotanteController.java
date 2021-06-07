package co.ufps.elecciones.controller;

import co.ufps.elecciones.dao.*;
import co.ufps.elecciones.entities.*;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/VotanteController")

public class VotanteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public VotanteController() {
        super();
    }
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String td = request.getParameter("tipodocumento");
		String nombre = request.getParameter("nombre");
		String documento = request.getParameter("documento");
		String email = request.getParameter("email");
		String proceso = request.getParameter("proceso");
					
		EleccionDAO elecciondao = new EleccionDAO();
		Tipo_DocumentoDAO tipodocumentodao = new Tipo_DocumentoDAO();
		VotanteDAO votantedao = new VotanteDAO();
		
		Eleccion eleccion = elecciondao.findById(Integer.parseInt(proceso));		
		Tipo_Documento tipodocumento = tipodocumentodao.findById(Integer.parseInt(td));
		Votante votante = new Votante(nombre, email, documento,tipodocumento,eleccion);
		
		votante.setTipodocumento(tipodocumento);
		votante.setEleccion(eleccion);
				
		votantedao.insert(votante);
		RequestDispatcher rd = request.getRequestDispatcher("Vistas/index.jsp");
		rd.forward(request, response);
	}
}