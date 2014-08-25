package br.edu.ifpb.monteiro.ads.dermasist.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entidade de patrimony atribudos and contains methods for creating 
 * patrimony.
 * @author Markus
 */

@Entity
@Table(name="PATRIMONY")
public class Patrimony implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    
    @ManyToOne (targetEntity = br.edu.ifpb.monteiro.ads.dermasist.model.Administrator.class)
    @JoinColumn(name="FK_ADMISTRADTR")
    private Administrator fk_admistrator;
   
    @Column(name="DESCRIPTION")
    private String description;
    
    @Column(name="OBSERVATIONS")
    private String observations;

    //Get's e Set's
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

    public Administrator getFk_admistrator() {
        return fk_admistrator;
    }

    public void setFk_admistrator(Administrator fk_admistrator) {
        this.fk_admistrator = fk_admistrator;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.getID());
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
        final Patrimony other = (Patrimony) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patrimony{" + "ID=" + getID() + ", fk_admistrator=" + fk_admistrator + ", description=" + description + ", observations=" + observations + '}';
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
