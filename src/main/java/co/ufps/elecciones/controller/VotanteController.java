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


@WebServlet("/VotanteController")
public class VotanteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public VotanteController() {
        super();
    }
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Está entrando");
		Tipo_DocumentoDAO tdd = new Tipo_DocumentoDAO();
		EleccionDAO ed = new EleccionDAO();
		
		List<Eleccion> elecciones = ed.findAll();		
		List<Tipo_Documento> tiposdocumento = tdd.findAll();
		
		request.setAttribute("elecciones", elecciones);
		request.setAttribute("tiposdocumento", tiposdocumento);
		request.getRequestDispatcher("vistas/registro_votante.jsp").forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
	}
}