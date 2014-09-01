package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Provider;
import java.util.List;

/**
 *
 * @author Wilde Arruda, modify by Vanderlan Gomes
 */
public class ProviderDao extends AbstractDAO<Provider>{
    
    
    public ProviderDao(){
        super(Provider.class);
    }

    @Override
    public List<Provider> findAll() {
        return getEntityManager().createQuery("from Provider prov").getResultList();
    }
    
}
