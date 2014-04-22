package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.security.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Markus
 */
@Entity
@Table(name="CONSULT")
public class Consult extends Identifiable{
   
    @Column(name="FK_PATIENT")
    @OneToMany
    private Scheduling fk_patient;
    
    @Column(name="FK_DOCTOR")
    @OneToMany
    private Scheduling fk_doctor;
    
    @Column(name="TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp time;
    
    @Column(name="DIAGNOSIS")
    private String diagnosis;
    
    @Column(name="EXAM")
    private String exam;
    
    @Column(name="MEDICATION")
    private String medication;
    
    @Column(name="DATE")
    @Temporal(TemporalType.DATE)
    private Date date;

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
        
}
