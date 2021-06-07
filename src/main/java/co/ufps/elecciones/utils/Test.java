package co.ufps.elecciones.utils;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import co.ufps.elecciones.dao.CandidatoDAO;
import co.ufps.elecciones.dao.EleccionDAO;
import co.ufps.elecciones.dao.EstamentoDAO;
import co.ufps.elecciones.dao.Tipo_DocumentoDAO;
import co.ufps.elecciones.dao.VotanteDAO;
import co.ufps.elecciones.dao.VotoDAO;
import co.ufps.elecciones.entities.Candidato;
import co.ufps.elecciones.entities.Eleccion;
import co.ufps.elecciones.entities.Estamento;

public class Test {
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		//CandidatoDAO c = new CandidatoDAO();
		//System.out.println(c.findAll().size());

		 EleccionDAO eDao = new EleccionDAO();
		 CandidatoDAO cDao = new CandidatoDAO();
		 VotoDAO vDao = new VotoDAO();
		 Tipo_DocumentoDAO tDao = new Tipo_DocumentoDAO();
		 VotanteDAO vtDao = new VotanteDAO();
		 EstamentoDAO etDao = new EstamentoDAO();
		 
		 //System.out.println(.size());
		 //System.out.println(cDao.findAll().size());
		 //System.out.println(vDao.findAll().size());
		 //System.out.println(tDao.findAll().size());
		 //System.out.println(vtDao.findAll().size());
		 //System.out.println(etDao.findAll().size());
		 
	}
}
