package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.util.Date;

/**
 * @author Elisângela
 */
public class Payment extends Identifiable {
    
    private int interest;
    private Date expirationDate;
    private String typeOfPayment;
    private Date dateOfPayment;
    private float value;
}
