package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.DoctorDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Doctor;
import br.edu.ifpb.monteiro.ads.dermasist.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author cassio
 */
public class DoctorService implements Serializable{
    
    @Inject
    private DoctorDao doctorDao;
    
    @Transactional
    public void create(Doctor doctor) throws DermaSistException {
        if(doctor.getName() == null || doctor.getName().trim().equals("")){
            throw new DermaSistException("O nome do médico é obrigatório");
        }
        
        this.doctorDao.create(doctor);
    }
}
