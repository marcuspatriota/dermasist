package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.ProviderDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Provider;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class ProviderService implements Serializable {

    @Inject
    private ProviderDaoIF dao;

    
    public void create(Provider entity) throws DermaSistException {
        dao.create(entity);
    }

    
    public void delete(Provider entity) throws DermaSistException {
        dao.delete(entity);
    }

    
    public void update(Provider entity) throws DermaSistException {
        dao.update(entity);
    }

    
    public Provider findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }

    
    public List<Provider> findAll() {

        return dao.findAll();

    }

}
