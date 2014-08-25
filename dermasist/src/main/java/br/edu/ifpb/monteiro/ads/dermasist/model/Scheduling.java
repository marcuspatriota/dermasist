package br.edu.ifpb.monteiro.ads.dermasist.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Scheduling entity contains the creation of scheduling attributes and methods.
 * @author Elisângela
 */
@Entity
@Table(name="SCHEDULING")
public class Scheduling implements Serializable {
    
    /**
     * Attributes and their relationships and annotations 
     * for persistence in the bank.
     */
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
        
    @Column(name="SCHEDULING_DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Column(name="TYPE_OF_SCHEDULING")
    private String typeOfScheduling;
    
    @Column(name="TIMETABLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timetable;

    @ManyToOne
    @JoinColumn(name="FK_PATIENT")
    private Patient fk_patient;
    
    /**
     * Getters and Setters
     * @return atribute
     */
    
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

    public Patient getFk_patient() {
        return fk_patient;
    }

    /**
     * @return the timetable
     */
    public Date getTimetable() {
        return timetable;
    }

    /**
     * @param timetable the timetable to set
     */
    public void setTimetable(Date timetable) {
        this.timetable = timetable;
    }

    /**
     * @return the ID
     */
    public Long getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Long ID) {
        this.ID = ID;
    }
    
 }
