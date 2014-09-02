package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.PatrimonyDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Patrimony;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class PatrimonyService implements Serializable, ServiceIF<Patrimony> {

    @Inject
    private PatrimonyDao dao;

    @Override
    public void create(Patrimony entity) throws DermaSistException {
        dao.create(entity);
    }

    @Override
    public void delete(Patrimony entity) throws DermaSistException {
        dao.delete(entity);
    }

    @Override
    public void update(Patrimony entity) throws DermaSistException {
        dao.update(entity);
    }

    @Override
    public Patrimony findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }

    @Override
    public List<Patrimony> findAll() {

        return dao.findAll();

    }

}
