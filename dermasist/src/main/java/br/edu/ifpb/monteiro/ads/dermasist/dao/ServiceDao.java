package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Service;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Markus
 */
@Stateless
public class ServiceDao extends DaoAbstract<Service> {
    @PersistenceContext(unitName = "dermasist_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServiceDao() {
        super(Service.class);
    }
    
}
