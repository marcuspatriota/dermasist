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
public class SecretaryService implements Serializable {

    @Inject
    private SecretaryDao dao;

    public void create(Secretary entity) throws DermaSistException {
        dao.create(entity);
    }

    public void delete(Secretary entity) throws DermaSistException {
        dao.delete(entity);
    }

    public void update(Secretary entity) throws DermaSistException {
        dao.update(entity);
    }

    public Secretary findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }

    public List<Secretary> findAll() {

        return dao.findAll();

    }

}
