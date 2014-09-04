package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.ConsultDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Consult;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author cassio, modifield by Vanderlan Gomes
 */
public class ConsultService implements Serializable{
    
    @Inject
    private ConsultDaoIF<Consult> dao;

    public void create(Consult entity) throws DermaSistException {
       dao.create(entity);
    }

    public void delete(Consult entity) throws DermaSistException {
        dao.delete(entity);
    }

    public void update(Consult entity) throws DermaSistException {
        dao.update(entity);
    }

    public Consult findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }
    
    public List<Consult> findAll() {
       
        return dao.findAll();
    
    }

}
