package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Service;
import java.util.List;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class ServiceDao extends  AbstractDAO<Service>{
    
    
    public ServiceDao(){
        super(Service.class);
    }
   
    
    public List<Service> findAll() {
        return getEntityManager().createQuery("from Service svc").getResultList();
    }
 
}
