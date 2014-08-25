package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.ServiceDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Service;
import br.edu.ifpb.monteiro.ads.dermasist.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda
 */
public class ServiceService implements Serializable{
    
    @Inject
    private ServiceDao serviceDao;
    
    @Transactional
    public void create(Service service) throws DermaSistException {
        if(service.getName() == null || service.getName().trim().equals("")){
            throw new DermaSistException("O nome do serviço é obrigatório");
        }
        
        this.serviceDao.create(service);
    }
}
