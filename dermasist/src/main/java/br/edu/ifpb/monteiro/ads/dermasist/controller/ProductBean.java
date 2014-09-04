package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.services.ProductService;
import br.edu.ifpb.monteiro.ads.dermasist.model.Product;
import br.edu.ifpb.monteiro.ads.dermasist.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 * Controller to manage the communication between the page and the rest of project
 * 
 * @author cassio
 */
@Model
public class ProductBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ProductService productService;
    
    //A list to storage the data come from database
    private List<Product> products;
    private Product product;

    public ProductBean() {
        
    }
    
    @PostConstruct
    public void init(){
        this.clean();
    }
    
    private void clean() {
        this.product = new Product();
    }

    public void create() {
        try {
            this.productService.create(product);
            FacesUtil.addSuccessMessage("Produto cadastrado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    public List<Product> getProducts() {
        products = productService.findAll();
        return products;
    }
}
