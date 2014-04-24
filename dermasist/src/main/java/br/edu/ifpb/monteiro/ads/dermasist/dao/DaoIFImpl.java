package br.edu.ifpb.monteiro.ads.dermasist.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Markus
 * @param <T>
 */

public class DaoIFImpl<T> implements DaoIF<T>{
    
    @PersistenceUnit
    protected EntityManager getEntityManager(){
        EntityManagerFactory factory=null;
        EntityManager entityManager=null;
        try{
            factory = Persistence.createEntityManagerFactory("dermasist");
            entityManager = factory.createEntityManager();
        }finally{
            factory.close();
        }
        return entityManager;
    }
    
    @Override
    public T save(T entity) {
        EntityManager entityManager= getEntityManager();
        try{
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        }finally{
            entityManager.close();
        }
        return entity;
    }
    
    @Override
    public T update(T entity) {
       EntityManager entityManager= getEntityManager();
        try{
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        }finally{
            entityManager.close();
        }
        return entity;
    }
    
    @Override
    public void remove(T entity) {

        EntityManager entityManager= getEntityManager();
        try{
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        }finally{
            entityManager.close();
        }
    }
    
 
    
    @Override
    public List<T> getEntitys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T find(T entity) {
        
        return entity;
    }
    
    
    
}
