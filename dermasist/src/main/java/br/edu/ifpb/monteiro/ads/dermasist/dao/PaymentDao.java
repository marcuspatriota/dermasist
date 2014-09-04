package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.PaymentDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Payment;

/**
 *
 * @author cassio, modifield by Vanderlan Gomes
 */
public class PaymentDao extends AbstractDAO<Payment> implements PaymentDaoIF{

    public PaymentDao() {
        super(Payment.class);
    }

}
