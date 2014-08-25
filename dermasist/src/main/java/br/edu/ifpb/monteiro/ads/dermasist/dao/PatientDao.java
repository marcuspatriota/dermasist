package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Patient;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Wilde Arruda
 */
public class PatientDao implements Serializable {

    @Inject
    private EntityManager entityManager;

    public PatientDao() {

    }

    public void create(Patient patient) {
        entityManager.persist(patient);
    }

    public void update(Patient patient) {
        entityManager.merge(patient);
    }

    public void delete(Patient patient) {
        entityManager.remove(patient);
    }

    public List<Patient> findAll() {
        return entityManager.createQuery("from Patient pat").getResultList();
    }

    public Patient findById(Patient id) {
        return entityManager.find(Patient.class, id);
    }

}
