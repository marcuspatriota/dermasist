package br.edu.ifpb.monteiro.ads.dermasist.dao;

import java.util.List;

/**
 *
 * @author Markus
 * @param <T>
 */
public interface DaoIF<T> {
    
    public T save(T entity);
    public void update (T entity);
    public void remove (T entity);
    public void merge(T entity);
 //   public T getEntity(Serializable id);
//    public T getEntityByDetachedCriteria(DetachedCriteria criteria);
    public List<T> getEntitys();
//    public List<T> getListEntityByDetachedCriteria(DetachedCriteria criteria);
      
}
