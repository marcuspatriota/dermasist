package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Markus
 */
@Entity
public class Identifiable implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    
  }
