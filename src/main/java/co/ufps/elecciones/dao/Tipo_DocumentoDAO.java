package co.ufps.elecciones.dao;
import java.util.List;

import co.ufps.elecciones.entities.Eleccion;
import co.ufps.elecciones.entities.Tipo_Documento;
import co.ufps.elecciones.interfaces.GenericDao;
import co.ufps.elecciones.utils.Conexion;

public class Tipo_DocumentoDAO implements GenericDao<Tipo_Documento, Integer> {

	public Conexion conexion=new Conexion();
	
	@Override
	public void insert(Tipo_Documento entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().persist(entity);
		conexion.getManager().getTransaction().commit();
	}

	@Override
	public void update(Tipo_Documento entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().merge(entity);
		conexion.getManager().getTransaction().commit();
		
	}

	@Override
	public Tipo_Documento findById(Integer id) {
		conexion.getManager().getTransaction().begin();
		Tipo_Documento td = conexion.getManager().find(Tipo_Documento.class, id);
		conexion.getManager().getTransaction().commit();
		return td;
	}

	@Override
	public void delete(Tipo_Documento entity) {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().remove(entity);
		conexion.getManager().getTransaction().commit();
		
	}

	@Override
	public List<Tipo_Documento> findAll() {
		List<Tipo_Documento> ans = null;
		try {
			ans = conexion.getManager().createQuery("FROM Tipo_Documento").getResultList();
		} finally {
			conexion.getManager().close();
		}
		return ans;
	}

	@Override
	public void deleteAll() {
		conexion.getManager().getTransaction().begin();
		conexion.getManager().createNativeQuery("DELETE FROM tipodocumento").executeUpdate();
		conexion.getManager().getTransaction().commit();
	}

}
