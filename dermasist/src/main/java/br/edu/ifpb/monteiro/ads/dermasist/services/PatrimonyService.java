package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.PatrimonyDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Patrimony;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class PatrimonyService implements Serializable {

    @Inject
    private PatrimonyDaoIF dao;

    public void create(Patrimony entity) throws DermaSistException {
        dao.create(entity);
    }

    public void delete(Patrimony entity) throws DermaSistException {
        dao.delete(entity);
    }

    public void update(Patrimony entity) throws DermaSistException {
        dao.update(entity);
    }

    public Patrimony findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }

    public List<Patrimony> findAll() {

        return dao.findAll();

    }

}
