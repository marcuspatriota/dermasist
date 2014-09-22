package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.services.DoctorService;
import br.edu.ifpb.monteiro.ads.dermasist.model.Doctor;
import br.edu.ifpb.monteiro.ads.dermasist.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 * Controller to manage the communication between the page and the rest of
 * project
 *
 * @author cassio
 */
@Model
public class DoctorBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private DoctorService doctorService;
    private List<Doctor> doctors;
    
    private Doctor doctor;
    private Doctor selectedDoctor;
            
            
    @PostConstruct
    public void init() {
        this.clean();
    }
    
    private void clean() {
        this.doctor = new Doctor();
        this.selectedDoctor = new Doctor();
    }
    
    public void create() throws DermaSistException {
        
        try {
            doctorService.create(doctor);
            FacesUtil.addSuccessMessage("Médico Cadastrado com sucesso!");
        }
        catch(DermaSistException e){
            FacesUtil.addErrorMessage("Erro ao tentar cadastrado Médico!!");
        }
    }
    
    public void update() {
        try {
            this.doctorService.update(selectedDoctor);
            FacesUtil.addSuccessMessage("Médico editado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }

    public void delete() {
        try {
            this.doctorService.delete(selectedDoctor);
            FacesUtil.addSuccessMessage("Médico deletado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }
    /**
     * @return the doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * @return the doctors
     */
    public List<Doctor> getDoctors() {
        doctors = doctorService.findAll();
        return doctors;
    }

    public Doctor getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(Doctor selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
    
}
