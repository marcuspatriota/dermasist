package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Payment;
import br.edu.ifpb.monteiro.ads.dermasist.services.PaymentService;
import br.edu.ifpb.monteiro.ads.dermasist.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 * Controller to manage the communication between the page and the rest of
 * project
 *
 * @author cassio
 */
@Model
public class PaymentBean implements Serializable {

    @Inject
    private PaymentService paymentService;

    //A list to storage the data come from database
    private List<Payment> payments;
    private Payment payment;
    private Payment selectedPayment;

    public PaymentBean() {

    }

    public void create() {
        try {
            this.paymentService.create(getPayment());
            FacesUtil.addSuccessMessage("Pagamento registrado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }

    public void delete() {
        try {
            this.paymentService.delete(getSelectedPayment());
            FacesUtil.addSuccessMessage("Pagamento deletado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }

    public void update() {
        try {
            this.paymentService.update(getSelectedPayment());
            FacesUtil.addSuccessMessage("Pagamento alterado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }

    @PostConstruct
    public void init() {
        this.clean();
    }

    private void clean() {
        this.payment = new Payment();
        this.selectedPayment = new Payment();
    }

    /**
     * @return the payment
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    /**
     * @return the payments
     */
    public List<Payment> getPayments() {
        payments = paymentService.findAll();
        return payments;
    }

    public Payment getSelectedPayment() {
        return selectedPayment;
    }

    public void setSelectedPayment(Payment selectedPayment) {
        this.selectedPayment = selectedPayment;
    }

}
