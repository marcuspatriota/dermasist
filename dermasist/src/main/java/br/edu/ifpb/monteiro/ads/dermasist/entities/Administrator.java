package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entidade de admisnistrator contém atribudos e métodos de criação de uma 
 * administrator. 
 * @author Markus
 */
@Entity
@Table(name="ADMINISTRATOR")
public class Administrator extends Person{
  
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
        
 }
