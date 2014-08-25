package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Consult;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author cassio
 */
public class ConsultDao implements Serializable{
    
    @Inject
    private EntityManager entityManager;
    
    public ConsultDao(){
        
    }
    
    public void create(Consult consult) {
        entityManager.persist(consult);
    }

    public void update(Consult consult) {
        entityManager.merge(consult);
    }
    
    public void delete(Consult consult) {
        entityManager.remove(consult);
    }

    
    public List<Consult> findAll() {
        return entityManager.createQuery("from Consult cons").getResultList();
    }

    
    public Consult findById(Consult id) {
        return entityManager.find(Consult.class, id);
    }
    
}
