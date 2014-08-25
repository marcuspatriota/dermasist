package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Doctor;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author cassio
 */
public class DoctorDao implements Serializable{
    
    @Inject
    private EntityManager entityManager;
    
    public DoctorDao(){
        
    }
    
    public void create(Doctor doctor) {
        entityManager.persist(doctor);
    }

    public void update(Doctor doctor) {
        entityManager.merge(doctor);
    }
    
    public void delete(Doctor doctor) {
        entityManager.remove(doctor);
    }

    
    public List<Doctor> findAll() {
        return entityManager.createQuery("from Doctor doc").getResultList();
    }

    
    public Doctor findById(Doctor id) {
        return entityManager.find(Doctor.class, id);
    }
    
}
