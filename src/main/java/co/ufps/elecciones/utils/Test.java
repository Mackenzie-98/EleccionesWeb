package co.ufps.elecciones.utils;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import co.ufps.elecciones.dao.CandidatoDAO;
import co.ufps.elecciones.dao.EleccionDAO;
import co.ufps.elecciones.dao.Tipo_DocumentoDAO;
import co.ufps.elecciones.entities.Candidato;
import co.ufps.elecciones.entities.Eleccion;

public class Test {
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		//CandidatoDAO c = new CandidatoDAO();
		//System.out.println(c.findAll().size());

		 EleccionDAO e = new EleccionDAO();
		 List<Eleccion> list = e.findAll();
		 for(Eleccion x: list) {
			 System.out.println(x.toString());
		 }
//		 LocalDateTime t1 = LocalDateTime.now();
//		 LocalDateTime t2 = LocalDateTime.now();
//		 e.insert(new Eleccion(1, "Elecciones a rectoria 2021.",t1,t2,"Rector"));
	}
}
