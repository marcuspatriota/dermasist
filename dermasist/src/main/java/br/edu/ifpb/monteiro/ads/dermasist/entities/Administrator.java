package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Markus
 */
@Entity
@Table(name="ADMINISTRATOR")
public class Administrator extends Person{
  
    @Column(name="FK_PERSON")
    @OneToOne() 
    private Person fk_person;

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
        
 }
