package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Patrimony;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Wilde Arruda
 */
public class PatrimonyDao implements Serializable{
    
    @Inject
    private EntityManager entityManager;
    
    public PatrimonyDao(){
        
    }
    
    public void create(Patrimony patrimony) {
        entityManager.persist(patrimony);
    }

    public void update(Patrimony patrimony) {
        entityManager.merge(patrimony);
    }
    
    public void delete(Patrimony patrimony) {
        entityManager.remove(patrimony);
    }

    
    public List<Patrimony> findAll() {
        return entityManager.createQuery("from Patrimony patrim").getResultList();
    }

    
    public Patrimony findById(Patrimony id) {
        return entityManager.find(Patrimony.class, id);
    }
    
}
