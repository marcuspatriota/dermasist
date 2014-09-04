package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.PatientDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Patient;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class PatientDao extends AbstractDAO<Patient> implements PatientDaoIF{

    public PatientDao() {
        super(Patient.class);
    }

}
