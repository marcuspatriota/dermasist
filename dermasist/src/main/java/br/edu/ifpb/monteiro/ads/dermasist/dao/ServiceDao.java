package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Service;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Wilde Arruda
 */
public class ServiceDao implements Serializable{
    
    @Inject
    private EntityManager entityManager;
    
    public ServiceDao(){
        
    }
    
    public void create(Service service) {
        entityManager.persist(service);
    }

    public void update(Service service) {
        entityManager.merge(service);
    }
    
    public void delete(Service service) {
        entityManager.remove(service);
    }

    
    public List<Service> findAll() {
        return entityManager.createQuery("from Service svc").getResultList();
    }

    
    public Service findById(Service id) {
        return entityManager.find(Service.class, id);
    }
    
}
