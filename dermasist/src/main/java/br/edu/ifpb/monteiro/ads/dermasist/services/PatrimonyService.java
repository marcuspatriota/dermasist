package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.PatrimonyDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Patrimony;
import br.edu.ifpb.monteiro.ads.dermasist.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda
 */
public class PatrimonyService implements Serializable{
    
    @Inject
    private PatrimonyDao patrimonyDao;
    
    @Transactional
    public void create(Patrimony patrimony) throws DermaSistException {
        if(patrimony.getDescription()== null || patrimony.getDescription().trim().equals("")){
            throw new DermaSistException("O descrição do patrimônio é obrigatória");
        }
        
        this.patrimonyDao.create(patrimony);
    }
}
