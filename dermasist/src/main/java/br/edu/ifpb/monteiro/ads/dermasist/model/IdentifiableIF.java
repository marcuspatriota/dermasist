package br.edu.ifpb.monteiro.ads.dermasist.model;

import java.io.Serializable;

/**
 * Identifiable of the entities interface contains only method of recovery 
 * and a method of creation. 
 * @author Markus
 * @param <PK>
 */
public interface IdentifiableIF <PK extends Serializable>{

      public PK getID();
      public void setID(PK id);
  }
