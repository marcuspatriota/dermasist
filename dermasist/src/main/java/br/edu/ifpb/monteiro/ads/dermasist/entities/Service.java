package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Class Service
 * @author Markus
 */

@Entity
@Table(name="SERVICE")
public class Service implements IdentifiableIF, Serializable{
    
    /** 
     * Atributos e suas respectivas anotações para
     * persistência no banco.
     */
    
    @Id
    private Long ID;
    
    @ManyToOne(targetEntity = br.edu.ifpb.monteiro.ads.dermasist.entities.Administrator.class)
    private Administrator pk_admistrator;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="VALUE")
    private float value;
    
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
    
    public float getValue() {
        return value;
    }
    
    public void setValue(float value) {
        this.value = value;
    }

    public Administrator getPk_admistrator() {
        return pk_admistrator;
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
