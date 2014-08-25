package br.edu.ifpb.monteiro.ads.dermasist.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Product entity contains attributes and methods of product creation.
 * @author Elisângela
 */

@Entity
@Table(name="PRODUCT")
public class Product implements Serializable {
    
    /**
     * Attributes and their relationships and annotations 
     * for persistence in the bank.
     */
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="PRODUCT_VALUE")
    private BigDecimal value;
    
    @Column(name="DATE_OF_PURCHASE")
    @Temporal(TemporalType.DATE)
    private Date dateOfPurchase;
    
    @Column(name="EXPIRATIONS_DATE")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;
    
    @Column(name="FINALITY")
    private String finality;
    
    @ManyToMany(targetEntity = br.edu.ifpb.monteiro.ads.dermasist.model.Provider.class)
    @JoinTable(name="PRODUCT_PROVIDER",joinColumns = @JoinColumn(name="FK_PRODUCT", referencedColumnName = "ID"), 
            inverseJoinColumns = @JoinColumn(name="FK_PROVIDER", referencedColumnName = "ID"))
    private List<Provider> provider;
    
    @ManyToOne(targetEntity = br.edu.ifpb.monteiro.ads.dermasist.model.Administrator.class)
    @JoinColumn(name="FK_ADMINISTRATOR")
    private Administrator fk_administrator;

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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the dateOfPurchase
     */
    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    /**
     * @param dateOfPurchase the dateOfPurchase to set
     */
    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    /**
     * @return the expirationDate
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @return the finality
     */
    public String getFinality() {
        return finality;
    }

    /**
     * @param finality the finality to set
     */
    public void setFinality(String finality) {
        this.finality = finality;
    }

    /**
     * @return the provider
     */
    public List<Provider> getProvider() {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(List<Provider> provider) {
        this.provider = provider;
    }

    /**
     * @return the fk_administrator
     */
    public Administrator getFk_administrator() {
        return fk_administrator;
    }

    /**
     * @param fk_administrator the fk_administrator to set
     */
    public void setFk_administrator(Administrator fk_administrator) {
        this.fk_administrator = fk_administrator;
    }
}
