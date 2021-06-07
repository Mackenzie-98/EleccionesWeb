package co.ufps.elecciones.dao;

import java.util.List;

import co.ufps.elecciones.entities.Eleccion;
import co.ufps.elecciones.interfaces.GenericDao;
import co.ufps.elecciones.utils.Conexion;

public class EleccionDAO implements GenericDao<Eleccion, Integer> {

	public Conexion conexion = new Conexion();
	
	@Override
	public void insert(Eleccion entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().persist(entity);
		conexion.getManager().getTransaction().commit();
		
	}

	@Override
	public void update(Eleccion entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().merge(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public Eleccion findById(Integer id) {
		conexion.getManager().getTransaction().begin();
		Eleccion ans = conexion.getManager().find(Eleccion.class, id);
		conexion.getManager().getTransaction().commit();
		return ans;
	}

	@Override
	public void delete(Eleccion entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().remove(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public List<Eleccion> findAll() {
		conexion.getManager().getTransaction().begin();
		List<Eleccion> ans = conexion.getManager().createQuery("FROM Eleccion").getResultList();
		conexion.getManager().getTransaction().commit();
		return ans;
	}

	@Override
	public void deleteAll() {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().createNativeQuery("DELETE FROM eleccion").executeUpdate();
		conexion.getManager().getTransaction().commit();
	}

}
