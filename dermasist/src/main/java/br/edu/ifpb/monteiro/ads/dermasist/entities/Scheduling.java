package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author ElisÃ¢ngela
 */
@Entity
@Table(name="SCHEDULING")
public class Scheduling implements IdentifiableIF, Serializable {
    
    @Id
    private Long ID;
    
        
    @Column(name="DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Column(name="TYPE_OF_SCHEDULING")
    private String typeOfScheduling;
    
    @Column(name="TIMETABLE")
    private Timestamp timetable;

    @ManyToOne
    @JoinColumn(name="FK_PATIENT")
    private Patient fk_patient;
    
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTypeOfScheduling() {
        return typeOfScheduling;
    }

    public void setTypeOfScheduling(String typeOfScheduling) {
        this.typeOfScheduling = typeOfScheduling;
    }

    public Timestamp getTimetable() {
        return timetable;
    }

    public void setTimetable(Timestamp timetable) {
        this.timetable = timetable;
    }

    public Patient getFk_patient() {
        return fk_patient;
    }
    
    @Override
    public Serializable getID() {
     return this.ID;
    }

    @Override
    public void setID(Serializable id) {
       this.ID=(Long) id; 
    }
    
 }
