package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Patient;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface PatientDaoIF {

    public void create(Patient entity);

    public void delete(Patient entity);

    public void update(Patient entity);

    public List<Patient> findAll();

    public Patient findById(Long id);
}
