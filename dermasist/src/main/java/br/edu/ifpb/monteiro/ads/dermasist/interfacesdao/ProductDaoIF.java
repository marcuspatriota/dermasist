package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Product;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface ProductDaoIF {

    public void create(Product entity);

    public void delete(Product entity);

    public void update(Product entity);

    public List<Product> findAll();

    public Product findById(Long id);
}
