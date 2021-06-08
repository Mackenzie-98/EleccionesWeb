package co.ufps.elecciones.controller;

import java.io.IOException;
import java.util.List;

import co.ufps.elecciones.dao.*;
import co.ufps.elecciones.entities.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ValidarDatosController")
public class ValidarDatosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ValidarDatosController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String ele = request.getParameter("eleccion");
		String est = request.getParameter("estamento");
		String td = request.getParameter("tipodocumento");
		String nombre = request.getParameter("nombre");
		String documento = request.getParameter("documento");
		String email = request.getParameter("email");
		
		EleccionDAO elecciondao = new EleccionDAO();
		EstamentoDAO estamentodao = new EstamentoDAO();
		Tipo_DocumentoDAO tipodocumentodao = new Tipo_DocumentoDAO();
		VotanteDAO votantedao = new VotanteDAO();
		
		Eleccion eleccion = elecciondao.findById(Integer.parseInt(ele));
		Estamento estamento = estamentodao.findById(Integer.parseInt(est));
		Tipo_Documento tipodocumento = tipodocumentodao.findById(Integer.parseInt(td));
		
		Votante votante = new Votante(nombre, email, documento, tipodocumento, eleccion);
		List<Votante> votantes = eleccion.getVotantes();
		List<Candidato> candidatos = eleccion.getCandidatos();
		for(Votante v: votantes)
			if(v.getDocumento().equals(documento))
				//ERROR
		
		request.setAttribute("votante", votante);
		request.setAttribute("estamento", estamento);
		request.setAttribute("candidatos", candidatos);
		RequestDispatcher rd = request.getRequestDispatcher("votar.jsp");
		rd.forward(request, response);	
	}
}