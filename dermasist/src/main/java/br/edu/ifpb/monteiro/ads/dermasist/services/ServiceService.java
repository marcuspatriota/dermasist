package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.ServiceDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Service;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class ServiceService implements Serializable, ServiceIF<Service>{
    
    @Inject
    private ServiceDao dao;
    
    @Override
    public void create(Service entity) throws DermaSistException {
       dao.create(entity);
    }

    @Override
    public void delete(Service entity) throws DermaSistException {
        dao.delete(entity);
    }

    @Override
    public void update(Service entity) throws DermaSistException {
        dao.update(entity);
    }

    @Override
    public Service findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }
    
    @Override
    public List<Service> findAll() {
       
        return dao.findAll();
    
    }
}
