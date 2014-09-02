package br.edu.ifpb.monteiro.ads.dermasist.dao;

import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 * @param <T> Class of entity
 */
public interface AbstractDAOIf<T> {
    
    public void create(T entity);
    public void delete(T entity);
    public void update(T entity);
    public List<T> findAll();
    public T findById(Long id);
}
