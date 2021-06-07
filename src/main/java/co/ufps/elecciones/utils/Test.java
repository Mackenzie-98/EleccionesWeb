package co.ufps.elecciones.utils;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import co.ufps.elecciones.dao.*;
import co.ufps.elecciones.entities.*;
public class Test {
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		//CandidatoDAO c = new CandidatoDAO();
		//System.out.println(c.findAll().size());

		
		Tipo_DocumentoDAO ed = new Tipo_DocumentoDAO();
		List<Tipo_Documento> elecciones = ed.findAll();
		
	  	if(elecciones != null)
	  		System.out.println(elecciones.size());
		 //System.out.println(cDao.findAll().size());
		 //System.out.println(vDao.findAll().size());
		 //System.out.println(tDao.findAll().size());
		 //System.out.println(vtDao.findAll().size());
		 //System.out.println(etDao.findAll().size());
		 
	}
}
