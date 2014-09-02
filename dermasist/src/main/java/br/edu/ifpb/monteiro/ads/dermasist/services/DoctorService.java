package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.DoctorDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Doctor;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author cassio, modified by Vanderlan
 */
public class DoctorService implements Serializable, ServiceIF<Doctor>{
    
    @Inject
    private DoctorDao dao;
    
   @Override
    public void create(Doctor entity) throws DermaSistException {
       dao.create(entity);
    }

    @Override
    public void delete(Doctor entity) throws DermaSistException {
        dao.delete(entity);
    }

    @Override
    public void update(Doctor entity) throws DermaSistException {
        dao.update(entity);
    }

    @Override
    public Doctor findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }
    
    @Override
    public List<Doctor> findAll() {
       
        return dao.findAll();
    
    }

}
