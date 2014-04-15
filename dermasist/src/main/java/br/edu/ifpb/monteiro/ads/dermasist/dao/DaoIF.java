package br.edu.ifpb.monteiro.ads.dermasist.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Markus
 */
public interface DaoIF<T> {
    
    public void save(T entity);
    public void update (T entity);
    public void remove (T entity);
    public void merge(T entity);
    public T getEntity(Serializable id);
//    public T getEntityByDetachedCriteria(DetachedCriteria criteria);
    public List<T> getEntitys();
//    public List<T> getListEntityByDetachedCriteria(DetachedCriteria criteria);
      
}
