package co.ufps.elecciones.dao;

import java.util.List;

import co.ufps.elecciones.entities.Estamento;
import co.ufps.elecciones.interfaces.GenericDao;
import co.ufps.elecciones.utils.Conexion;

public class EstamentoDAO implements GenericDao<Estamento, Integer> {

	public Conexion conexion = new Conexion();
	
	@Override
	public void insert(Estamento entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().persist(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public void update(Estamento entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().merge(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public Estamento findById(Integer id) {
		conexion.getManager().getTransaction().begin();
		Estamento ans = conexion.getManager().find(Estamento.class, id);
		conexion.getManager().getTransaction().commit();
		return ans;
	}

	@Override
	public void delete(Estamento entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().remove(entity);
		conexion.getManager().getTransaction().commit();
		
	}

	@Override
	public List<Estamento> findAll() {
		conexion.getManager().getTransaction().begin();
		List<Estamento> ans = conexion.getManager().createQuery("FROM Estamento").getResultList();
		conexion.getManager().getTransaction().commit();
		return ans;
	}

	@Override
	public void deleteAll() {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().createNativeQuery("DELETE FROM estamento").executeUpdate();
		conexion.getManager().getTransaction().commit();
	}

}
