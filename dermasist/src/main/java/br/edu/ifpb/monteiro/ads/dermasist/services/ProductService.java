package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.ProductDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Product;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class ProductService implements Serializable , ServiceIF<Product>{

    private static final long serialVersionUID = 1L;

    @Inject
    private ProductDao dao;

    @Override
    public void create(Product entity) throws DermaSistException {
        dao.create(entity);
    }

    @Override
    public void delete(Product entity) throws DermaSistException {
        dao.delete(entity);
    }

    @Override
    public void update(Product entity) throws DermaSistException {
        dao.update(entity);
    }

    @Override
    public Product findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }

    @Override
    public List<Product> findAll() {

        return dao.findAll();

    }

}
