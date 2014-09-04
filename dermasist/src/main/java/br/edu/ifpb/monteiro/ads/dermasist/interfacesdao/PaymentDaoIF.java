package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Payment;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface PaymentDaoIF {

    public void create(Payment entity);

    public void delete(Payment entity);

    public void update(Payment entity);

    public List<Payment> findAll();

    public Payment findById(Long id);
}
