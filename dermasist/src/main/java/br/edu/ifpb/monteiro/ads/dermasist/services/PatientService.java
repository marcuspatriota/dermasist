package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.PatientDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Patient;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modified by Vanderlan Gomes
 */
public class PatientService implements Serializable, ServiceIF<Patient> {

    @Inject
    private PatientDao dao;

    @Override
    public void create(Patient entity) throws DermaSistException {
        dao.create(entity);
    }

    @Override
    public void delete(Patient entity) throws DermaSistException {
        dao.delete(entity);
    }

    @Override
    public void update(Patient entity) throws DermaSistException {
        dao.update(entity);
    }

    @Override
    public Patient findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }

    @Override
    public List<Patient> findAll() {

        return dao.findAll();

    }

}
