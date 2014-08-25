package br.edu.ifpb.monteiro.ads.dermasist.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entidade de payment atribudos yesterday and methods of creating a 
 * payment.
 * @author Elisângela
 */
@Entity
@Table(name="PAYMENT")
public class Payment implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    
    @Column(name="PAYMENT_VALUE")
    private BigDecimal value;
    
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

    public Collection<Scheduling> getScheduling() {
        return scheduling;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.getID());
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
        return "Payment{" + "ID=" + getID() + ", scheduling=" + scheduling + ", interest=" + interest + ", expirationDate=" + expirationDate + ", typeOfPayment=" + typeOfPayment + ", dateOfPayment=" + dateOfPayment + ", value=" + getValue() + '}';
    }

    /**
     * @return the value
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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
