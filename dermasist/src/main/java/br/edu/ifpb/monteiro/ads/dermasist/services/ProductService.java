package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.ProductDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Product;
import br.edu.ifpb.monteiro.ads.dermasist.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda
 */
public class ProductService implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private ProductDao productDao;
    
    @Transactional
    public void create(Product product) throws DermaSistException {
        if(product.getName() == null || product.getName().trim().equals("")){
            throw new DermaSistException("O nome do produto é obrigatório");
        }
        
        this.productDao.create(product);
    }
}
