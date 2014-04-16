package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product extends Identifiable {
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="VALUE")
    private float value;
    
    @Column(name="DATE_OF_PURCHASE")
    private Date dateOfPurchase;
    
    @Column(name="EXPIRATIONS_DATE")
    private Date expirationDate;
    
    @Column(name="FINALITY")
    private String finality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFinality() {
        return finality;
    }

    public void setFinality(String finality) {
        this.finality = finality;
    }
 
    
    
}
