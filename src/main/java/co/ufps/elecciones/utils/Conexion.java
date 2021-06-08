package co.ufps.elecciones.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class Conexion<T> {
	private Class<T> c;
	private static EntityManager em = null;
	
	public Conexion() {
		em = this.getManager();
	}
	
	public Conexion(Class<T> c) {
		em = this.getManager();
		this.c = c;
	}
	
	public void setC(Class<T> c){
		this.c = c;
	}
	
	public static EntityManager getManager(){
		if ( em == null ) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
            em = emf.createEntityManager();
        }
		return em;
	}

}