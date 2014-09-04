package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.ProviderDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Provider;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class ProviderDao extends AbstractDAO<Provider> implements ProviderDaoIF{
    
    
    public ProviderDao(){
        super(Provider.class);
    }

}
