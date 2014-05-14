package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entidade de patrimony contém atribudos e métodos de criação de uma 
 * patrymony.
 * @author Markus
 */

@Entity
@Table(name="PATRIMONY")
public class Patrimony implements IdentifiableIF, Serializable{
    
    @Id
    private Long ID;
    
    @ManyToOne (targetEntity = br.edu.ifpb.monteiro.ads.dermasist.entities.Administrator.class)
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
    public Serializable getID() {
        return this.ID;
    }

    @Override
    public void setID(Serializable id) {
        this.ID=(Long) id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.ID);
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
        return "Patrimony{" + "ID=" + ID + ", fk_admistrator=" + fk_admistrator + ", description=" + description + ", observations=" + observations + '}';
    }
    
 }
