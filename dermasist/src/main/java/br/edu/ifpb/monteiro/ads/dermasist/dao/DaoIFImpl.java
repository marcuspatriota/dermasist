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

public class DaoIFImpl<T> extends Dao<T> {

    public DaoIFImpl(Class<T> entityClass) {
        super(entityClass);
    }
    
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
  
}
