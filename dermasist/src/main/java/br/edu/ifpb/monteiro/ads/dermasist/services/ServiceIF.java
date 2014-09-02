
package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.util.jpa.Transactional;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 * @param <T>
 */
public interface ServiceIF<T> {
    
    @Transactional
    public void create(T entity) throws DermaSistException;
    @Transactional
    public void delete(T entity) throws DermaSistException;
    @Transactional
    public void update(T entity) throws DermaSistException;
    @Transactional
    public List<T> findAll() throws DermaSistException;
    @Transactional
    public T findById(Long id) throws DermaSistException;
}
