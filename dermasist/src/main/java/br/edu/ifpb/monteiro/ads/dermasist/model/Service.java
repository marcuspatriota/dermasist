package br.edu.ifpb.monteiro.ads.dermasist.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Service entity contains attributes and methods for creating services.
 * @author Markus
 */

@Entity
@Table(name="SERVICE")
public class Service implements Serializable{
    
    /** 
     * Attributes and their relationships and annotations 
     * for persistence in the bank.
     */
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    
    @ManyToOne(targetEntity = br.edu.ifpb.monteiro.ads.dermasist.model.Administrator.class)
    private Administrator pk_admistrator;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="SERVICE_VALUE", scale = 10, precision = 2)
    private BigDecimal value;
    
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
    
    public Administrator getPk_admistrator() {
        return pk_admistrator;
    }
    
    /**
     * @return the value
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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
        
}
