package br.edu.ifpb.monteiro.ads.dermasist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Class Secretary
 * @author Markus
 */
@Entity
@Table(name="SECRETARY")
public class Secretary extends Person{
    
    /**
     * Atributos e suas respectivas anotações para
     * persistência no banco.
     */
    
    @OneToOne
    @JoinColumn(name="FK_PERSON")
    private Person fk_person;
    
    @Column(name="SALARY")
    private float salary;
    
    @Column(name="ROLE")
    private String role;

    /**
     * Getters and Setters
     * @return atributo
     */
    
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Person getFk_person() {
        return fk_person;
    }

    public void setFk_person(Person fk_person) {
        this.fk_person = fk_person;
    }
  
    
}
