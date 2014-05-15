package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Patient;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Markus
 */
@Stateless
public class PatientDao extends DaoAbstract<Patient> {
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
    public PatientDao() {
        super(Patient.class);
    }
    
}
