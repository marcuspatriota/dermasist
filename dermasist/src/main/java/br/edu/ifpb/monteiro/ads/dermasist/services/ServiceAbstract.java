package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.AbstractDAO;

/**
 *
 * @author Vanderlan Gomes
 * @param <T>
 */
public abstract class ServiceAbstract<T> {

    private AbstractDAO<T> dao;
    
    public void create(){
        
    }
}
