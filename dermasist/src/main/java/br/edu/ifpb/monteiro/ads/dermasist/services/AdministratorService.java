package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.AdministratorDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Administrator;
import br.edu.ifpb.monteiro.ads.dermasist.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda
 */
public class AdministratorService implements Serializable{
    
    @Inject
    private AdministratorDao administratorDao;
    
    @Transactional
    public void create(Administrator administrator) throws DermaSistException {
        if(administrator.getName() == null || administrator.getName().trim().equals("")){
            throw new DermaSistException("O nome do administrador é obrigatório");
        }
        
        this.administratorDao.create(administrator);
    }
}
