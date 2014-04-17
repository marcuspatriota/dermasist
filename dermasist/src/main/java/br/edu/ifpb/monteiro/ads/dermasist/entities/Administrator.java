package br.edu.ifpb.monteiro.ads.dermasist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Markus
 */
@Entity
@Table(name="ADMINISTRATOR")
public class Administrator extends Person{
    
    @Column(name="FK_PERSON")
    @OneToMany 
    private Person fk_person;

    public Person getFk_person() {
        return fk_person;
    }

    public void setFk_person(Person fk_person) {
        this.fk_person = fk_person;
    }
        
}
