package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Payment;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author cassio
 */
public class PaymentDao implements Serializable{
    
    @Inject
    private EntityManager entityManager;
    
    public void create(Payment payment) {
        entityManager.persist(payment);
    }

    public void update(Payment payment) {
        entityManager.merge(payment);
    }
    
    public void delete(Payment payment) {
        entityManager.remove(payment);
    }

    
    public List<Payment> findAll() {
        return entityManager.createQuery("from Payment pay").getResultList();
    }
    
    public Payment findById(Payment id) {
        return entityManager.find(Payment.class, id);
    }
    
}
