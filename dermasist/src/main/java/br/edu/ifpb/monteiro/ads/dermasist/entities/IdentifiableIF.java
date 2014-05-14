package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;

/**
 * Interface de intentificação das entidades contendo apenas o método de recuperação 
 * e um método de criação. 
 * @author Markus
 * @param <PK>
 */
public interface IdentifiableIF <PK extends Serializable>{

      public PK getID();
      public void setID(PK id);
  }
