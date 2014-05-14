package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entidade de payment contém atribudos e métodos de criação de uma 
 * payment.
 * @author Elisângela
 */
@Entity
@Table(name="PAYMENT")
public class Payment implements IdentifiableIF, Serializable {
    
    @Id
    @Column(name="PK_PAYMENT")
    private Long ID;
    
    @ManyToMany
    @JoinTable(name="PAYMENT_SCHEDULING",joinColumns = @JoinColumn(name="FK_PAYMENT"), 
            inverseJoinColumns = @JoinColumn(name="FK_SCHEDULING"))
    private Collection<Scheduling> scheduling;
    
    @Column(name="INTEREST")
    private int interest;
    
    @Column(name="EXPIRATION_DATE")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;
    
    @Column(name="TYPE_OF_PAYMENT")
    private String typeOfPayment;
    
    @Column(name="DATE_OF_PAYMENT")
    @Temporal(TemporalType.DATE)
    private Date dateOfPayment;
    
    @Column(name="VALUE")
    private float value;
    
    //Get's e Set's
    
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

    public Collection<Scheduling> getScheduling() {
        return scheduling;
    }

    @Override
    public Serializable getID() {
       return ID;
        
    }

    @Override
    public void setID(Serializable id) {
        this.ID=(Long) id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.ID);
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
        final Payment other = (Payment) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Payment{" + "ID=" + ID + ", scheduling=" + scheduling + ", interest=" + interest + ", expirationDate=" + expirationDate + ", typeOfPayment=" + typeOfPayment + ", dateOfPayment=" + dateOfPayment + ", value=" + value + '}';
    }
         
}
