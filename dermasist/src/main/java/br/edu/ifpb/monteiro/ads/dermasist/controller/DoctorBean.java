package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.services.DoctorService;
import br.edu.ifpb.monteiro.ads.dermasist.model.Doctor;
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
public class DoctorBean   implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private DoctorService doctorService;
    private List<Doctor> doctors;
    
    @Inject
    private Doctor doctor;

    @PostConstruct
    public void init() {
        this.clean();
    }

    private void clean() {
        this.doctor = new Doctor();
    }

    public void create() throws DermaSistException{
        doctorService.create(doctor);
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

}
