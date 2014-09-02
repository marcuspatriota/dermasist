package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Patrimony;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class PatrimonyDao extends AbstractDAO<Patrimony>implements Serializable{

    public PatrimonyDao() {
        super(Patrimony.class);
    }
    
    @Override
    public List<Patrimony> findAll() {
        return getEntityManager().createQuery("from Patrimony patrim").getResultList();
    }
    
}
