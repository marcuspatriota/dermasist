package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Product;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Wilde Arruda
 */
public class ProductDao implements Serializable{
    
    @Inject
    private EntityManager entityManager;
    
    public ProductDao(){
        
    }
    
    public void create(Product product) {
        entityManager.persist(product);
    }

    public void update(Product product) {
        entityManager.merge(product);
    }
    
    public void delete(Product product) {
        entityManager.remove(product);
    }

    
    public List<Product> findAll() {
        return entityManager.createQuery("from Product prod").getResultList();
    }

    
    public Product findById(Product id) {
        return entityManager.find(Product.class, id);
    }
    
}
