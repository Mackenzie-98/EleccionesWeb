package co.ufps.elecciones.dao;

import java.util.List;

import co.ufps.elecciones.entities.Voto;
import co.ufps.elecciones.interfaces.GenericDao;
import co.ufps.elecciones.utils.Conexion;

public class VotoDAO implements GenericDao<Voto, Integer> {

	public Conexion conexion;
	
	@Override
	public void insert(Voto entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().persist(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public void update(Voto entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().merge(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public Voto findById(Integer id) {
		conexion.getManager().getTransaction().begin();
		Voto ans = conexion.getManager().find(Voto.class, id);
		conexion.getManager().getTransaction().commit();
		return ans;
	}

	@Override
	public void delete(Voto entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().remove(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public List<Voto> findAll() {
		conexion.getManager().getTransaction().begin();
		List<Voto> ans = conexion.getManager().createNativeQuery("SELECT * FROM voto").getResultList();
		conexion.getManager().getTransaction().commit();
		return ans;
	}

	@Override
	public void deleteAll() {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().createNativeQuery("DELETE FROM voto").executeUpdate();
		conexion.getManager().getTransaction().commit();
	}

}
