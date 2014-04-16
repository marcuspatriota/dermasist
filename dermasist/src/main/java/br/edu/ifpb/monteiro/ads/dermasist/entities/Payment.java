package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Elisângela
 */
@Entity
@Table(name="PAYMENT")
public class Payment extends Identifiable {
    
    @Column(name="INTEREST")
    private int interest;
    
    @Column(name="EXPIRATION_DATE")
    private Date expirationDate;
    
    @Column(name="TYPE_OF_PAYMENT")
    private String typeOfPayment;
    
    @Column(name="DATE_OF_PAYMENT")
    private Date dateOfPayment;
    
    @Column(name="VALUE")
    private float value;

    
    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(String typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
    
}
