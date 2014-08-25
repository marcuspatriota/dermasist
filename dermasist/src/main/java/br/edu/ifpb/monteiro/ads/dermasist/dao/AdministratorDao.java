package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Administrator;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Wilde Arruda
 */
public class AdministratorDao implements Serializable{
    
    @Inject
    private EntityManager entityManager;
    
    public AdministratorDao(){
        
    }
    
    public void create(Administrator administrator) {
        entityManager.persist(administrator);
    }

    public void update(Administrator administrator) {
        entityManager.merge(administrator);
    }
    
    public void delete(Administrator administrator) {
        entityManager.remove(administrator);
    }

    
    public List<Administrator> findAll() {
        return entityManager.createQuery("from Administrator adm").getResultList();
    }

    
    public Administrator findById(Administrator id) {
        return entityManager.find(Administrator.class, id);
    }
    
}
