package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.ConsultDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Consult;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author cassio, modifield by Vanderlan Gomes
 */
public class ConsultService implements Serializable, ServiceIF<Consult>{
    
    @Inject
    private ConsultDao dao;

    @Override
    public void create(Consult entity) throws DermaSistException {
       dao.create(entity);
    }

    @Override
    public void delete(Consult entity) throws DermaSistException {
        dao.delete(entity);
    }

    @Override
    public void update(Consult entity) throws DermaSistException {
        dao.update(entity);
    }

    @Override
    public Consult findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }
    
    @Override
    public List<Consult> findAll() {
       
        return dao.findAll();
    
    }

}
