package co.ufps.elecciones.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import co.ufps.elecciones.dao.Tipo_DocumentoDAO;
	
public class Test {
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	
	public static void main(String [] args) {
		Tipo_DocumentoDAO td = new Tipo_DocumentoDAO();
		System.out.println(td.findAll().size());
	}
}
