package co.ufps.elecciones.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {
		private static EntityManager manager = null;
		
		public Conexion() {
			manager = this.getManager();
		}
		
		
		public void setManager(EntityManager manager) {
			this.manager = manager;
		}


		public EntityManager getManager(){
			if ( manager == null ) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
	            manager = emf.createEntityManager();
	        }
			return manager;
		}
}
