package br.edu.ifpb.monteiro.ads.dermasist.model;

/**
 * Identifiable of the entities interface contains only method of recovery 
 * and a method of creation. 
 * @author Markus
 * @param <T>
 */
public interface IdentifiableIF<T> {

      public Long getID();
      public void setID(Long id);
  }
