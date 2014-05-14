package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Class Product
 * @author Elisângela
 */

@Entity
@Table(name="PRODUCT")
public class Product implements IdentifiableIF, Serializable {
    
    /**
     * Atributos e suas respectivas anotações e relacionamentos para
     * persistência no banco.
     */
    
    @Id
    @Column(name="PK_PRODUCT")
    private Long ID;
    
    @ManyToMany(targetEntity = br.edu.ifpb.monteiro.ads.dermasist.entities.Provider.class)
    @JoinTable(name="PRODUCT_PROVIDER",joinColumns = @JoinColumn(name="FK_PRODUCT"), 
            inverseJoinColumns = @JoinColumn(name="FK_PROVIDER"))
    private Collection<Provider> provider;
    
    @ManyToOne(targetEntity = br.edu.ifpb.monteiro.ads.dermasist.entities.Administrator.class)
    @JoinColumn(name="FK_ADMINISTRATOR")
    private Administrator fk_administrator;
    
    @Column(name="NAME")
    private String name;
    
    
    @Column(name="VALUE")
    private float value;
    
    @Column(name="DATE_OF_PURCHASE")
    @Temporal(TemporalType.DATE)
    private Date dateOfPurchase;
    
    @Column(name="EXPIRATIONS_DATE")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;
    
    @Column(name="FINALITY")
    private String finality;

    /**
     * Getters and Setters
     * @return atribute
     */
    
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

    public Administrator getFk_administrator() {
        return fk_administrator;
    }
    
    public Collection<Provider> getProvider() {
        return provider;
    }

    @Override
    public Serializable getID() {
        return ID;
    }

    @Override
    public void setID(Serializable id) {
            this.ID=(Long) id;
        
    }
    
    
      
}
