package br.edu.ifpb.monteiro.ads.dermasist.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "doctorbean")
@ViewScoped
public class SecretaryBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private PersonBean fk_person;
    private String speciality;
    private String registrationCode;
    private float salary;
 

    public SecretaryBean() {

    }

    /**
     * @return the speciality
     */
    public String getSpeciality() {
        return speciality;
    }
    

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * @return the registrationCode
     */
    public String getRegistrationCode() {
        return registrationCode;
    }

    /**
     * @param registrationCode the registrationCode to set
     */
    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the fk_person
     */
    public PersonBean getFk_person() {
        return fk_person;
    }

    /**
     * @param fk_person the fk_person to set
     */
    public void setFk_person(PersonBean fk_person) {
        this.fk_person = fk_person;
    }
    
}
