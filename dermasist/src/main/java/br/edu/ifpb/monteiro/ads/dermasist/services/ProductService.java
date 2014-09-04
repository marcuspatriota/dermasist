package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.ProductDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Product;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class ProductService implements Serializable {

    @Inject
    private ProductDaoIF dao;

    public void create(Product entity) throws DermaSistException {
        dao.create(entity);
    }

    public void delete(Product entity) throws DermaSistException {
        dao.delete(entity);
    }

    public void update(Product entity) throws DermaSistException {
        dao.update(entity);
    }

    public Product findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }

    public List<Product> findAll() {

        return dao.findAll();

    }

}
