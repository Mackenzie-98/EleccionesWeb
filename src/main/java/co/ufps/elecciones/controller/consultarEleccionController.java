package co.ufps.elecciones.controller;

import co.ufps.elecciones.dao.*;
import co.ufps.elecciones.entities.*;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/consultarEleccionController")
public class consultarEleccionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public consultarEleccionController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String e = request.getParameter("idEleccion");
		EleccionDAO elecciondao = new EleccionDAO();
		Eleccion eleccion = elecciondao.findById(Integer.parseInt(e));
	}

}
