package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.ProductDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Product;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class ProductDao extends AbstractDAO<Product> implements ProductDaoIF{

    public ProductDao() {
        super(Product.class);
    }
    
}
