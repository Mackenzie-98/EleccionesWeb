package co.ufps.elecciones.interfaces;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T,Id extends Serializable> {
    public void insert(T entity);
    
    public void update(T entity);
     
    public T findById(Id id);
     
    public void delete(T entity);
     
    public List<T> findAll();
     
    public void deleteAll();
}
