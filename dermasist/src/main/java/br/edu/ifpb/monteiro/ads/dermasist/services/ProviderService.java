package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.ProviderDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Provider;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class ProviderService implements Serializable,ServiceIF<Provider> {

    @Inject
    private ProviderDao dao;

    @Override
    public void create(Provider entity) throws DermaSistException {
        dao.create(entity);
    }

    @Override
    public void delete(Provider entity) throws DermaSistException {
        dao.delete(entity);
    }

    @Override
    public void update(Provider entity) throws DermaSistException {
        dao.update(entity);
    }

    @Override
    public Provider findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }

    @Override
    public List<Provider> findAll() {

        return dao.findAll();

    }

}
