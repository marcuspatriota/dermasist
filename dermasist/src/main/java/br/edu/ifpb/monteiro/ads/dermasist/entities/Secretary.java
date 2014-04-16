package br.edu.ifpb.monteiro.ads.dermasist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Markus
 */
@Entity
@Table(name="SECRETARY")
public class Secretary extends Person{
    
    @Column(name="SALARY")
    private float salary;
    
    @Column(name="ROLE")
    private String role;

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
    
     
}
