package br.edu.ifpb.monteiro.ads.dermasist.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Secretary entity inherits the attributes of the Person entity 
 * beyond the actual attributes secretary.
 * @author Markus
 */
@Entity
@Table(name="SECRETARY")
public class Secretary extends Person{
    
    /**
     * Attributes and their relationships and annotations 
     * for persistence in the bank.
     */
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    
    @OneToOne
    @JoinColumn(name="FK_PERSON")
    private Person fk_person;
    
    @Column(name="SALARY")
    private BigDecimal salary;
    
    @Column(name="SECRETARY_ROLE")
    private String role;

    /**
     * Getters and Setters
     * @return atribute
     */
    
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

    /**
     * @return the ID
     */
    @Override
    public Long getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    @Override
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * @return the salary
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
  
    
}
