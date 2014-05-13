package br.edu.ifpb.monteiro.ads.dermasist.dao;

import java.util.List;
import javax.persistence.EntityManager;

/**
 * Abstract class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting.
 * 
 * @author Markus
 * @param <T>
 */
public abstract class DaoAbstract<T> {
    private Class<T> entityClass;

    /**
     * The class constructor receives with Parliament the entity that will be 
     * persisted in the database.
     * @param entityClass 
     */
    public DaoAbstract(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    /**
     * Abstrator method to retrieve the EntityManager 
     * @return 
     */
    protected abstract EntityManager getEntityManager();

    /**
     * Persistence method of an entity in the database, return a persisted entity.
     * @param entity 
     */
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    /**
     * Update method of the data of an entity in the database, return a 
     * persisted entity updated.
     * @param entity 
     */
    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    /**
     * Method of removing a database entity receives as parameter the entity 
     * to be removed.
     * @param entity 
     */
    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }
    
    /**
     * Method to fetch an entity in the database has an ID parameter.
     * @param id
     * @return 
     */
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    /**
     * Method to fetch all the entities in the database, return a list of 
     * the entity. 
     * @return 
     */
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    /**
     * 
     * @param range
     * @return 
     */
    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    /**
     * Method to count the amount of entity, has in return an integer with the
     * amount.
     * @return 
     */
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
}
