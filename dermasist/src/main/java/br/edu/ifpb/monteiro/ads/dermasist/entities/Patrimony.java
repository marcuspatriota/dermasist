package br.edu.ifpb.monteiro.ads.dermasist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Markus
 */
@Entity
@Table(name="PATRIMONY")
public class Patrimony extends Identifiable{
    
    @Column(name="DESCRIPTION")
    private String description;
    
    @Column(name="OBSERVATIONS")
    private String observations;

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
    
    
    
}