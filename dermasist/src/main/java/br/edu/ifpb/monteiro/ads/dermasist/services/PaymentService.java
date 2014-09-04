package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.PaymentDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Payment;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author cassio, modifield by Vanderlan Gomes
 */
public class PaymentService implements Serializable {

    @Inject
    private PaymentDaoIF dao;

    public void create(Payment entity) throws DermaSistException {
        dao.create(entity);
    }

    public void delete(Payment entity) throws DermaSistException {
        dao.delete(entity);
    }

    public void update(Payment entity) throws DermaSistException {
        dao.update(entity);
    }

    public Payment findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }

    public List<Payment> findAll() {

        return dao.findAll();

    }

}
