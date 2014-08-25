package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.PaymentDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Payment;
import br.edu.ifpb.monteiro.ads.dermasist.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author cassio
 */
public class PaymentService implements Serializable {

    @Inject
    private PaymentDao paymentDao;

    @Transactional
    public void create(Payment payment) throws DermaSistException {
        this.paymentDao.create(payment);
    }

}
