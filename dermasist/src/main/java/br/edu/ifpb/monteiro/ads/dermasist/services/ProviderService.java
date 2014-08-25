package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.ProviderDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Provider;
import br.edu.ifpb.monteiro.ads.dermasist.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda
 */
public class ProviderService implements Serializable{
    
    @Inject
    private ProviderDao providerDao;
    
    @Transactional
    public void create(Provider provider) throws DermaSistException {
        if(provider.getName() == null || provider.getName().trim().equals("")){
            throw new DermaSistException("O nome do fornecedor é obrigatório");
        }
        
        this.providerDao.create(provider);
    }
}
