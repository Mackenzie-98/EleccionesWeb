package co.ufps.elecciones.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import co.ufps.elecciones.dao.CandidatoDAO;
import co.ufps.elecciones.dao.Tipo_DocumentoDAO;
import co.ufps.elecciones.entities.Candidato;
	
public class Test {
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	
	public static void main(String [] args) {
		CandidatoDAO c = new CandidatoDAO();
		System.out.println(c.findAll().size());
	}
}
