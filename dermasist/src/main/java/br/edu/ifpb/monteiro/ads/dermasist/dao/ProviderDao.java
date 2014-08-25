package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Provider;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Wilde Arruda
 */
public class ProviderDao implements Serializable{
    
    @Inject
    private EntityManager entityManager;
    
    public ProviderDao(){
        
    }
    
    public void create(Provider provider) {
        entityManager.persist(provider);
    }

    public void update(Provider provider) {
        entityManager.merge(provider);
    }
    
    public void delete(Provider provider) {
        entityManager.remove(provider);
    }

    
    public List<Provider> findAll() {
        return entityManager.createQuery("from Provider prov").getResultList();
    }

    
    public Provider findById(Provider id) {
        return entityManager.find(Provider.class, id);
    }
    
}
