package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Patient;
import java.util.List;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class PatientDao extends AbstractDAO<Patient> {

    public PatientDao() {
        super(Patient.class);
    }

  
    @Override
    public List<Patient> findAll() {
        return getEntityManager().createQuery("from Patient pat").getResultList();
    }
  
}
