package br.edu.ifpb.monteiro.ads.dermasist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Markus
 */
@Entity
@Table(name="DOCTOR")
public class Doctor extends Person {
    
    @Column(name="FK_PERSON")
    @OneToOne
    private Person fk_person;
    
    @Column(name="SPECIALTY")
    private String specialty;
    
    @Column (name="REGISTRATION_CODE")
    private String registrationCode;
    
    @Column (name="SALARY")
    private float salary;

    
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Person getFk_person() {
        return fk_person;
    }

    public void setFk_person(Person fk_person) {
        this.fk_person = fk_person;
    }
       
}
