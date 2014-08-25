package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Secretary;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author cassio
 */
public class SecretaryDao implements Serializable{
    
    @Inject
    private EntityManager entityManager;
    
    public void create(Secretary secretary) {
        entityManager.persist(secretary);
    }

    public void update(Secretary secretary) {
        entityManager.merge(secretary);
    }
    
    public void delete(Secretary secretary) {
        entityManager.remove(secretary);
    }

    
    public List<Secretary> findAll() {
        return entityManager.createQuery("from Secretary sec").getResultList();
    } 
    
    public Secretary findById(Secretary id) {
        return entityManager.find(Secretary.class, id);
    }
    
}
