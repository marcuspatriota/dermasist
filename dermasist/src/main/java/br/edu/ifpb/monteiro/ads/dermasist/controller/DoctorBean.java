package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.dao.DoctorDao;
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
 * Controller to manage the communication between the page and the rest of project
 * 
 * @author cassio
 */
@Model
public class DoctorBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private DoctorService doctorService;

    //Only used for get data from database without filter or rule to be applied
    @Inject
    private DoctorDao doctorDao;

    //A list to storage the data come from database
    private List<Doctor> doctors;
    private Doctor doctor;

    public DoctorBean() {

    }

    @PostConstruct
    public void init() {
        this.clean();
    }

    private void clean() {
        this.doctor = new Doctor();
    }

    public void create() {
        try {
            this.doctorService.create(doctor);
            FacesUtil.addSuccessMessage("Médico cadastrado com sucesso!");
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
        doctors = doctorDao.findAll();
        return doctors;
    }
}
