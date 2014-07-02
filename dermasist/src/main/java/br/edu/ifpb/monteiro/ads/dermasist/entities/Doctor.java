package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Doctor entity contains atribudos and methods of creating a 
 * Doctor.
 * @author Markus
 */
@Entity
@Table(name="DOCTOR")
public class Doctor extends Person{
   
    @ManyToOne
    @JoinColumn(name="FK_PERSON")
    private Person fk_person;
    
    @Column(name="SPECIALITY")
    private String speciality;
    
    @Column (name="REGISTRATION_CODE")
    private String registrationCode;
    
    @Column (name="SALARY")
    private float salary;

    

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.fk_person);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Doctor other = (Doctor) obj;
        if (!Objects.equals(this.fk_person, other.fk_person)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Doctor{" + "fk_person=" + fk_person + ", specialty=" + speciality + ", registrationCode=" + registrationCode + ", salary=" + salary + '}';
    }

    /**
     * @return the speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
}
