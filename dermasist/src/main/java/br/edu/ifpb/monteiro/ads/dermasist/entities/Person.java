package br.edu.ifpb.monteiro.ads.dermasist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person extends Identifiable {
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="DATE_OF_BIRTH")
    private String dateOfBirth;
    
    @Column(name="SEX")
    private char sex;
    
    @Column(name="CPF")
    private String cpf;
    
    @Column(name="RG")
    private String rg;
    
    @Column(name="STREET")
    private String street;
    
    @Column(name="NUMBER")
    private String number;
    
    @Column(name="CITY")
    private String city;
    
    @Column(name="NEIGHBORHOOD")
    private String neighborhood;
    
    @Column(name="STATE")
    private String state;
    
    @Column(name="CELLULAR")
    private String cellular;
    
    @Column(name="PHONE")
    private String phone;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getCellular() {
        return cellular;
    }

    public void setCellular(String cellular) {
        this.cellular = cellular;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   
   
}
