package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Person;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Markus
 */
@Stateless
public class PersonDao extends DaoAbstract<Person> {
    @PersistenceContext(unitName = "dermasist_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonDao() {
        super(Person.class);
    }
    
}
