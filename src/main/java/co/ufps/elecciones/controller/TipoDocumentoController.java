package co.ufps.elecciones.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TipoDocumentoController
 */
@WebServlet("/TipoDocumentoController")
public class TipoDocumentoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TipoDocumentoController() {
        super();
    }
    
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	HttpSession session = request.getSession(true);
//		
//		String nombreTxt = request.getParameter("nombre");
//		String descripcionTxt = request.getParameter("descripcion");
//		String plantillaTxt = request.getParameter("plantilla");
//		 
//		Campana campana = new Campana();
//		
//		campana.setDescripcion(descripcionTxt);
//		campana.setNombre(nombreTxt);
//		campana.setPlantilla(plantillaTxt);
//		
//		String usuarioSession = (String) session.getAttribute("userName");
//		UsuarioDao uDao = new UsuarioDao();
//		Usuario usuarioBean = uDao.find(usuarioSession);
//		
//		campana.setUsuarioBean(usuarioBean);
//		
//		CampanaDao cDao = new CampanaDao();
//		cDao.insert(campana);
//		
//		request.setAttribute("msgResultado", "La campaña ha sido creada correctamente"); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
//		request.getRequestDispatcher("/campana.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
//	}

}
