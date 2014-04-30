package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Markus
 */

@Entity
@Table(name="SERVICE")
public class Service implements Identifiable, Serializable{
    
    @Id
    private Long ID;
    
    @ OneToMany (targetEntity = br.edu.ifpb.monteiro.ads.dermasist.entities.Administrator.class)
    private Collection<Administrator> pk_admistrator;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="VALUE")
    private float value;
    
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

    @Override
    public Serializable getID() {
       return this.ID;
    }

    @Override
    public void setID(Serializable id) {
        this.ID=(Long) id;   
    }
       
}
