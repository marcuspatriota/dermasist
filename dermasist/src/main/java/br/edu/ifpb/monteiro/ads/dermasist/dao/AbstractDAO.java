package br.edu.ifpb.monteiro.ads.dermasist.dao;

import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Vanderlan Gomes
 * @param <T>
 */
public abstract class AbstractDAO<T> implements AbstractDAOIf<T>{

    @Inject
    private EntityManager entityManager;
    private Class<T> entity;

    public AbstractDAO(Class<T> entityClass) {
        this.entity = entityClass;
    }

    @Override
    public void create(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(T entity) {
        entityManager.refresh(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(T entity) {
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }
     
    @Override
    public T findById(Long id) {
        return entityManager.find(entity, id);
    }
    
    @Override
    public abstract List<T> findAll();

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public Class<T> getEntity() {
        return entity;
    }

    public void setEntity(Class<T> entity) {
        this.entity = entity;
    }
  
}
