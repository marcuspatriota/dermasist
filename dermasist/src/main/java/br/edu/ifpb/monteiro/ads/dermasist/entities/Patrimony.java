package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Markus
 */

@Entity
@Table(name="PATRIMONY")
public class Patrimony implements Identifiable, Serializable{
    
    @Id
    private Long ID;
    
    @ManyToOne (targetEntity = br.edu.ifpb.monteiro.ads.dermasist.entities.Administrator.class)
    @JoinColumn(name="FK_ADMISTRADTR")
    private Administrator fk_admistrator;
   
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

    @Override
    public Serializable getID() {
        return this.ID;
    }

    @Override
    public void setID(Serializable id) {
        this.ID=(Long) id;
    }
            
}
