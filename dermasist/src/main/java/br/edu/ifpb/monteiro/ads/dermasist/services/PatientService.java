package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.PatientDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Patient;
import br.edu.ifpb.monteiro.ads.dermasist.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda
 */
public class PatientService implements Serializable{
    
    @Inject
    private PatientDao patientDao;
    
    @Transactional
    public void create(Patient patient) throws DermaSistException {
        if(patient.getName() == null || patient.getName().trim().equals("")){
            throw new DermaSistException("O nome do paciente é obrigatório");
        }
        
        this.patientDao.create(patient);
    }
}
