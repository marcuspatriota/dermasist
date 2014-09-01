package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Payment;
import java.util.List;

/**
 *
 * @author cassio, modify by Vanderlan Gomes
 */
public class PaymentDao extends AbstractDAO<Payment>{

    public PaymentDao() {
        super(Payment.class);
    }

    
    @Override
    public List<Payment> findAll() {
        return getEntityManager().createQuery("from Payment pay").getResultList();
    }
   
}
