package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Consult;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Markus
 */
@Stateless
public class ConsultDao extends DaoAbstract<Consult> {
    @PersistenceContext(unitName = "dermasist_PU")
    private EntityManager em;
    
    /**
     * The class constructor receives with Parliament the entity that will be 
     * persisted in the database.
     * @return 
     */
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    /**
     * Constructor for the class play this class for the parent class.
     */
    public ConsultDao() {
        super(Consult.class);
    }
    
}
