package br.edu.ifpb.monteiro.ads.dermasist.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Person entity has atributes that will be inherited by classes:
 * Administrator, Doctor, Patient and Secretary.
 * @author Elisângela
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person  implements Serializable {
    
    /**
     * Attributes and their respective annotations 
     * for persistence in stock
//    @SequenceGenerator(name = "person_sequence_generator", sequenceName = "person_sequence")
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_sequence_generator")
     */
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID",nullable = false)
    private Long ID;
    
    @Column(name="NAME",nullable = false)
    private String name;
    
    @Column(name="DATE_OF_BIRTH",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    
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
    
    @Column(name="PERSON_STATE",nullable = false)
    private String state;
    
    @Column(name="MOBILE",nullable = false)
    private String mobile;
    
    @Column(name="PHONE")
    private String phone;

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
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
