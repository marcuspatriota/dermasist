package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Patient;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class PatientDao extends AbstractDAO<Patient> {

    public PatientDao() {
        super(Patient.class);
    }

}
