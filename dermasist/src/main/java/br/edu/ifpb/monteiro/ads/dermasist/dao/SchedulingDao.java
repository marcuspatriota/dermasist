package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Scheduling;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Markus
 */
@Stateless
public class SchedulingDao extends DaoAbstract<Scheduling> {
    @PersistenceContext(unitName = "dermasist_PU")
    private EntityManager em;

    /**
     * Implementation of the method for recovering the EntityManager abstract
     * class.
     * @return 
     */
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     * Constructor for the class play this class for the parent class.
     */
    public SchedulingDao() {
        super(Scheduling.class);
    }
    
}
