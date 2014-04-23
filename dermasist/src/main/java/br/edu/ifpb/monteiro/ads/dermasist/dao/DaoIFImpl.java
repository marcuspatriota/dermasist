package br.edu.ifpb.monteiro.ads.dermasist.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import org.eclipse.persistence.sessions.Session;

/**
 *
 * @author Markus
 * @param <T>
 */

public class DaoIFImpl<T> implements DaoIF<T>{
    
    @PersistenceUnit
    protected EntityManager em;
    private Session session;

    @Override
    public T save(T entity) {
        this.em.persist(entity);
        return entity;
        
    }

    @Override
    public void update(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void merge(T entity) {
        this.em.merge(entity);
    }

    @Override
    public List<T> getEntitys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
