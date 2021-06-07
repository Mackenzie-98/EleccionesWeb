package co.ufps.elecciones.dao;

import java.util.List;



import co.ufps.elecciones.interfaces.GenericDao;
import co.ufps.elecciones.utils.Conexion;
import co.ufps.elecciones.entities.Votante;

public class VotanteDAO implements GenericDao <Votante, Integer> {
	
	public Conexion conexion = new Conexion();
	
	@Override
	public void insert(Votante entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().persist(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public void update(Votante entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().merge(entity);
		conexion.getManager().getTransaction().commit();
		
	}

	@Override
	public Votante findById(Integer id) {
		conexion.getManager().getTransaction().begin();
		Votante v = conexion.getManager().find(Votante.class, id);
		conexion.getManager().getTransaction().commit();
		return v;
	}

	@Override
	public void delete(Votante entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().remove(entity);
		conexion.getManager().getTransaction().commit();
		
	}

	@Override
	public List<Votante> findAll() {
		conexion.getManager().getTransaction().begin();
		List<Votante> ans = conexion.getManager().createQuery("FROM Votante").getResultList();
		conexion.getManager().getTransaction().commit();
		return ans;
	}

	@Override
	public void deleteAll() {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().createNativeQuery("DELETE FROM votante").executeUpdate();
		conexion.getManager().getTransaction().commit();
		
	}
}
