package br.edu.ifpb.monteiro.ads.dermasist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Elisângela
 */
@Entity
@Table(name="PATIENT")
public class Patient extends Person {
    
    @Column(name="PK_PERSON")
    @OneToMany 
    private Person person;
    
    @Column(name="MOTHER_IS_NAME")
    private String motherIsName;
    
    @Column(name="BLOOD_TYPE")
    private String bloodType;
    
    @Column(name="FLESH_TONE")
    private String fleshTone; // cor da pele
        
    @Column(name="EMERGENCY_CONTACT")
    private String emergencyContact;
    
    @Column(name="HEALTH_PLAN")
    private String healthPlan;
    
    @Column (name="SUS_CARD")
    private String susCard;
    
    @Column(name="WEIGHT")
    private int weight;
    
    @Column(name="HEIGHT")
    private float height;

    
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getMotherIsName() {
        return motherIsName;
    }

    public void setMotherIsName(String motherIsName) {
        this.motherIsName = motherIsName;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getFleshTone() {
        return fleshTone;
    }

    public void setFleshTone(String fleshTone) {
        this.fleshTone = fleshTone;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(String healthPlan) {
        this.healthPlan = healthPlan;
    }

    public String getSusCard() {
        return susCard;
    }

    public void setSusCard(String susCard) {
        this.susCard = susCard;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }



    
    
}
