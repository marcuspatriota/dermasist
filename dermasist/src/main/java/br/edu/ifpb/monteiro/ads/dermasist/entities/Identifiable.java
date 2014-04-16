package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Markus
 */
@Entity
public class Identifiable implements Serializable{

    @Id
    private long ID;
    
    
}
