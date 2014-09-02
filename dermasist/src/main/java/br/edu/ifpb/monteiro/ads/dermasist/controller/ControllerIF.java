
package br.edu.ifpb.monteiro.ads.dermasist.controller;

import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 * @param <T>
 */
public interface ControllerIF <T>{
    
    public void create();
    public void delete();
    public void update();
    public List<Object> findAll();
    public Object findById(Long id);
}
