package co.ufps.elecciones.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.ufps.elecciones.dao.*;
import co.ufps.elecciones.entities.*;

@WebServlet("/IndexController")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexController() {
        super();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		EleccionDAO ed = new EleccionDAO();
		List<Eleccion> elecciones = ed.findAll();
		
		request.setAttribute("elecciones", elecciones);
		request.getRequestDispatcher("vistas/index.jsp").forward(request, response);
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/*String eleccion = request.getParameter("eleccion");
		EleccionDAO ed = new EleccionDAO();
		Eleccion e = ed.findById(Integer.parseInt(eleccion));
		
		request.setAttribute("eleccion", eleccion);*/
		RequestDispatcher rd = request.getRequestDispatcher("/Vistas/validar_datos.jsp");
		rd.forward(request, response);
		
		
	}
}