package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.PaymentDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Payment;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author cassio, modifield by Vanderlan Gomes
 */
public class PaymentService implements Serializable, ServiceIF<Payment> {
    
    @Inject
    private PaymentDao dao;
    
    @Override
    public void create(Payment entity) throws DermaSistException {
        dao.create(entity);
    }
    
    @Override
    public void delete(Payment entity) throws DermaSistException {
        dao.delete(entity);
    }
    
    @Override
    public void update(Payment entity) throws DermaSistException {
        dao.update(entity);
    }
    
    @Override
    public Payment findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }
    
    @Override
    public List<Payment> findAll() {
        
        return dao.findAll();
        
    }
    
}
