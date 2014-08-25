package br.edu.ifpb.monteiro.ads.dermasist.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Administrator authority and atribudos contains methods for creating a 
 * administrator. 
 * @author Markus
 */
@Entity
@Table(name="ADMINISTRATOR")
public class Administrator extends Person{
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    
    @ManyToOne
    @JoinColumn(name="FK_PERSON")
    private Person fk_person;

    //Get's and Set's
    public Person getFk_person() {
        return fk_person;
    }

    public void setFk_person(Person fk_person) {
        this.fk_person = fk_person;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.fk_person);
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
        final Administrator other = (Administrator) obj;
        return Objects.equals(this.fk_person, other.fk_person);
    }

    @Override
    public String toString() {
        return "Administrator{" + "fk_person=" + fk_person + '}';
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
        
 }
