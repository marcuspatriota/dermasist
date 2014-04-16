package br.edu.ifpb.monteiro.ads.dermasist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Markus
 */
@Entity
@Table(name="PROVIDER")
public class Provider extends Identifiable{
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="STREET")
    private String street; //Rua
    
    @Column(name="NUMBER")
    private int number;
    
    @Column(name="NEIGHBORHOOD")
    private String neighborhood; //Bairro
    
    @Column(name="STATE")
    private String state;
    
    @Column(name="CNPJ")
    private String cnpj;
    
    @Column(name="PHONE")
    private String phone;

    
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
    
    
    
}
