package co.ufps.elecciones.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {
		private EntityManager manager = null;
		
		public Conexion() {
		}
		
		
		public void setManager(EntityManager manager) {
			this.manager = manager;
		}


		public EntityManager getManager(){
			if ( manager == null ) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
	            this.setManager(emf.createEntityManager());
	        }
			return manager;
		}
}
