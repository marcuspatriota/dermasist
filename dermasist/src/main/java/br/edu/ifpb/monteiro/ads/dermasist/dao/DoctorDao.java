package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.DoctorDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Doctor;

/**
 *
 * @author cassio, modifield by Vanderlan Gomes
 */
public class DoctorDao extends AbstractDAO<Doctor> implements DoctorDaoIF{
    
    public DoctorDao() {
        super(Doctor.class);
    }

}
