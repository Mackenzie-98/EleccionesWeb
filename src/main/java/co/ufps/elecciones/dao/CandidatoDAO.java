package co.ufps.elecciones.dao;

import java.util.List;

import co.ufps.elecciones.entities.Candidato;
import co.ufps.elecciones.interfaces.GenericDao;
import co.ufps.elecciones.utils.Conexion;

public class CandidatoDAO implements GenericDao<Candidato, Integer> {

	public Conexion conexion;
	
	@Override
	public void insert(Candidato entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().persist(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public void update(Candidato entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().merge(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public Candidato findById(Integer id) {
		conexion.getManager().getTransaction().begin();
		Candidato ans = conexion.getManager().find(Candidato.class, id);
		conexion.getManager().getTransaction().commit();
		return ans;
	}

	@Override
	public void delete(Candidato entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().remove(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public List<Candidato> findAll() {
		conexion.getManager().getTransaction().begin();
		List<Candidato> ans = conexion.getManager().createNativeQuery("SELECT * FROM candidato").getResultList();
		conexion.getManager().getTransaction().commit();
		return ans;
	}

	@Override
	public void deleteAll() {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().createNativeQuery("DELETE FROM candidato").executeUpdate();
		conexion.getManager().getTransaction().commit();
	}

}
