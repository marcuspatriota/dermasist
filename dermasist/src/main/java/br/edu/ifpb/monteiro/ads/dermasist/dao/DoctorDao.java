package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Doctor;
import java.util.List;

/**
 *
 * @author cassio, modify by Vanderlan Gomes
 */
public class DoctorDao extends AbstractDAO<Doctor> {
    
    public DoctorDao() {
        super(Doctor.class);
    }

    @Override
    public List<Doctor> findAll() {
        return getEntityManager().createQuery("from Doctor doc").getResultList();
    }

}
