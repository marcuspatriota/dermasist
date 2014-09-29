package br.edu.ifpb.monteiro.ads.dermasist.controller;

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
    
    private List<Patient> patients;
    private Patient patient;
     private Patient selectPatient;

    public PatientBean() {
        
    }
    
    @PostConstruct
    public void init(){
        patient = new Patient();
        selectPatient = new Patient();
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
   
       public void update() {
        try {
            this.patientService.update(selectPatient);
            FacesUtil.addSuccessMessage("Paciente editado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }

    public void delete() {
        try {
            this.patientService.delete(selectPatient);
            FacesUtil.addSuccessMessage("Paciente deletado com sucesso!");
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
        patients = patientService.findAll();
        return patients;
    }

    public Patient getSelectPatient() {
        return selectPatient;
    }

    public void setSelectPatient(Patient selectPatient) {
        this.selectPatient = selectPatient;
    }
    
    
    
}
