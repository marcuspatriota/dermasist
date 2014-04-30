package br.edu.ifpb.monteiro.ads.dermasist.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Markus
 * 
 */


public class DaoIFImpl extends Dao<DaoIFImpl> {
    
    @PersistenceContext(unitName = "dermasist_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DaoIFImpl() {
        super(DaoIFImpl.class);
    }
      
}
