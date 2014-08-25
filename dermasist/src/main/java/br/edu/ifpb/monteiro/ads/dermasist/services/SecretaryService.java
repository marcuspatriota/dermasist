package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.SecretaryDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Secretary;
import br.edu.ifpb.monteiro.ads.dermasist.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author cassio
 */
public class SecretaryService implements Serializable{
    
    @Inject
    private SecretaryDao secretaryDao;
    
    @Transactional
    public void create(Secretary secretary) throws DermaSistException {
        if(secretary.getName() == null || secretary.getName().trim().equals("")){
            throw new DermaSistException("O nome do(a) secretário(a) é obrigatório");
        }
        
        this.secretaryDao.create(secretary);
    }
    
}
