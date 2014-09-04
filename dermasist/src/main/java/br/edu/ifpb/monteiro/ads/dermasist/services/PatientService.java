package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.PatientDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Patient;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modified by Vanderlan Gomes
 */
public class PatientService implements Serializable{

    @Inject
    private PatientDaoIF dao;

    public void create(Patient entity) throws DermaSistException {
        dao.create(entity);
    }

    public void delete(Patient entity) throws DermaSistException {
        dao.delete(entity);
    }

    public void update(Patient entity) throws DermaSistException {
        dao.update(entity);
    }

    public Patient findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }

    public List<Patient> findAll() {

        return dao.findAll();

    }

}
