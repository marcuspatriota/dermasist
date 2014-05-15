package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Consult Entity contains atribudos and methods of creating a 
 * consultation
 * @author Markus
 */
@Entity
@Table(name="CONSULT")
public class Consult implements IdentifiableIF, Serializable{
   
    @Id
    @Column(name="PK_CONSULT")
    private Long ID;
   
    @ManyToOne(targetEntity = br.edu.ifpb.monteiro.ads.dermasist.entities.Patient.class)
    @JoinColumn(name="FK_PATIENT")
    private Scheduling fk_patient;
    
    @ManyToOne(targetEntity = br.edu.ifpb.monteiro.ads.dermasist.entities.Doctor.class)
    @JoinColumn(name="FK_DOCTOR")
    private Doctor fk_doctor;
        
    @Column(name="TIME")
    @Temporal(TemporalType.DATE)
    private GregorianCalendar time;
       
    @Column(name="DIAGNOSIS")
    private String diagnosis;
    
    @Column(name="EXAM")
    private String exam;
    
    @Column(name="MEDICATION")
    private String medication;
    
    @Column(name="DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
   
    // Get's and Set's
    
    public GregorianCalendar getTime() {
        return time;
    }

    public void setTime(GregorianCalendar time) {
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

    @Override
    public Serializable getID() {
      return this.ID;
    }

    @Override
    public void setID(Serializable id) {
       this.ID=(Long) id;
    }

    public Scheduling getFk_patient() {
        return fk_patient;
    }

    public void setFk_patient(Scheduling fk_patient) {
        this.fk_patient = fk_patient;
    }

    public Doctor getFk_doctor() {
        return fk_doctor;
    }

    public void setFk_doctor(Doctor fk_doctor) {
        this.fk_doctor = fk_doctor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.ID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Consult other = (Consult) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consult{" + "ID=" + ID + ", fk_patient=" + fk_patient + ", fk_doctor=" + fk_doctor + ", time=" + time + ", diagnosis=" + diagnosis + ", exam=" + exam + ", medication=" + medication + ", date=" + date + '}';
    }
    
}
