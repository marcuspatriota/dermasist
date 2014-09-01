package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.dao.PatientDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.services.PatientService;
import br.edu.ifpb.monteiro.ads.dermasist.model.Patient;
import br.edu.ifpb.monteiro.ads.dermasist.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 * Controller to manage the communication between the page and the rest of project
 * 
 * @author cassio
 */
@Model
public class PatientBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private PatientService patientService;
    
    //Only used for get data from database without filter or rule to be applied
    @Inject
    private PatientDao patientDao;
    
    //A list to storage the data come from database
    private List<Patient> patients;
    private Patient patient;

    public PatientBean() {
        
    }
    
    @PostConstruct
    public void init(){
        this.clean();
    }
    
    private void clean() {
        this.patient = new Patient();
    }

    public void create() {
        try {
            this.patientService.create(patient);
            FacesUtil.addSuccessMessage("Paciente cadastrado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }
   
    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public List<Patient> getPatients() {
        patients = patientDao.findAll();
        return patients;
    }
    
}
