package br.edu.ifpb.monteiro.ads.dermasist.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Provider entity contains the creation of supplier attributes and methods.
 * @author Markus
 */
@Entity
@Table(name="PROVIDER")
public class Provider implements Serializable{
    
    /**
     * Attributes and their relationships and annotations 
     * for persistence in the bank.
     */
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
      
    @Column(name="NAME")
    private String name;
    
    @Column(name="STREET")
    private String street; //Rua
    
    @Column(name="NUMBER")
    private int number;
    
    @Column(name="NEIGHBORHOOD")
    private String neighborhood; //Bairro
    
    @Column(name="PROVIDER_STATE")
    private String state;
    
    @Column(name="CNPJ")
    private String cnpj;
    
    @Column(name="PHONE")
    private String phone;
    
    //This attributte do not exists in first project from Markus and Elysângela;
    
    @Column(name="CITY", nullable = false)
    private String city;
    
    @ManyToMany(mappedBy = "provider", targetEntity = Product.class)
    private List<Product> products;

    /**
     * Getters and Setters
     * @return atribute
     */
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the ID
     */
    public Long getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * @return the products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
