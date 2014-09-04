package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.ServiceDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Service;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class ServiceService implements Serializable {

    @Inject
    private ServiceDaoIF dao;

    public void create(Service entity) throws DermaSistException {
        dao.create(entity);
    }

    public void delete(Service entity) throws DermaSistException {
        dao.delete(entity);
    }

    public void update(Service entity) throws DermaSistException {
        dao.update(entity);
    }

    public Service findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }

    public List<Service> findAll() {

        return dao.findAll();

    }
}
