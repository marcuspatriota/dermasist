package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Person entity has atributes that will be inherited by classes:
 * Administrator, Doctor, Patient and Secretary.
 * @author Elisângela
 */
@Entity
@Table(name="PERSON")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person implements IdentifiableIF, Serializable {
    
    /**
     * Attributes and their respective annotations 
     * for persistence in stock
     */
    
    @Id
    @Column(name="ID",nullable = false)
    private Long ID;
    
    @Column(name="NAME",nullable = false)
    private String name;
    
    @Column(name="DATE_OF_BIRTH",nullable = false)
    private String dateOfBirth;
    
    @Column(name="SEX",nullable = false)
    private char sex;
    
    @Column(name="CPF",nullable = false)
    private String cpf;
    
    @Column(name="RG",nullable = false)
    private String rg;
    
    @Column(name="STREET",nullable = false)
    private String street;
    
    @Column(name="NUMBER",nullable = false)
    private String number;
    
    @Column(name="CITY",nullable = false)
    private String city;
    
    @Column(name="NEIGHBORHOOD",nullable = false)//BAIRRO
    private String neighborhood;
    
    @Column(name="STATE",nullable = false)
    private String state;
    
    @Column(name="MOBILE",nullable = false)
    private String mobile;
    
    @Column(name="PHONE")
    private String phone;

    
    public Person(){
        
    }
    
    public Person(Long ID, String name, String dateOfBirth, char sex, String cpf, String rg, String street, String number, String city, String neighborhood, String state, String mobile, String phone) {
        this.ID = ID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.cpf = cpf;
        this.rg = rg;
        this.street = street;
        this.number = number;
        this.city = city;
        this.neighborhood = neighborhood;
        this.state = state;
        this.mobile = mobile;
        this.phone = phone;
    }
    
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

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public Serializable getID() {
       return this.ID;
    }

    @Override
    public void setID(Serializable id) {
      this.ID=(Long) id;
    }
 
}
