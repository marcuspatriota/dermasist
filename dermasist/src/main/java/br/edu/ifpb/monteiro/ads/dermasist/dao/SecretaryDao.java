package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Secretary;
import java.util.List;

/**
 *
 * @author cassio, modifield by Vanderlan Gomes
 */
public class SecretaryDao extends AbstractDAO<Secretary>{

    public SecretaryDao() {
        super(Secretary.class);
    }
    
    @Override
    public List<Secretary> findAll() {
        return getEntityManager().createQuery("from Secretary sec").getResultList();
    } 
    
}
