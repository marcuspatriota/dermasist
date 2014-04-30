package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;

/**
 *
 * @author Markus
 * @param <PK>
 */
public interface Identifiable <PK extends Serializable>{

      public PK getID();
      public void setID(PK id);
  }
