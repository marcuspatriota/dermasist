package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Product;
import java.util.List;

/**
 *
 * @author Wilde Arruda, modify by Vanderlan Gomes
 */
public class ProductDao extends AbstractDAO<Product>{

    public ProductDao() {
        super(Product.class);
    }
    
    @Override
    public List<Product> findAll() {
        return getEntityManager().createQuery("from Product prod").getResultList();
    }

}
