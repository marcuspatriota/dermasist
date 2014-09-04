package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.DoctorDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Doctor;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author cassio, modified by Vanderlan
 */
public class DoctorService implements Serializable{
    
    @Inject
    private DoctorDaoIF dao;
    
    public void create(Doctor entity) throws DermaSistException {
       dao.create(entity);
    }

    public void delete(Doctor entity) throws DermaSistException {
        dao.delete(entity);
    }

    public void update(Doctor entity) throws DermaSistException {
        dao.update(entity);
    }

    public Doctor findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }
    
    public List<Doctor> findAll() {
       
        return dao.findAll();
    
    }

}
