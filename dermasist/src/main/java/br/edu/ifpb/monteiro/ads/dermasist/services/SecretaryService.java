package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.SecretaryDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Secretary;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author cassio, modifield by Vanderlan Gomes
 */
public class SecretaryService implements Serializable, ServiceIF<Secretary> {
    
    @Inject
    private SecretaryDao dao;
    
    @Override
    public void create(Secretary entity) throws DermaSistException {
        dao.create(entity);
    }
    
    @Override
    public void delete(Secretary entity) throws DermaSistException {
        dao.delete(entity);
    }
    
    @Override
    public void update(Secretary entity) throws DermaSistException {
        dao.update(entity);
    }
    
    @Override
    public Secretary findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }
    
    @Override
    public List<Secretary> findAll() {
        
        return dao.findAll();
        
    }
    
}
