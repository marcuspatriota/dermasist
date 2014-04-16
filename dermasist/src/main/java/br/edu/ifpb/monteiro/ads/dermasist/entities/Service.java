package br.edu.ifpb.monteiro.ads.dermasist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Markus
 */
@Entity
@Table(name="SERVICE")
public class Service extends Identifiable{
    
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
    
    
    
}