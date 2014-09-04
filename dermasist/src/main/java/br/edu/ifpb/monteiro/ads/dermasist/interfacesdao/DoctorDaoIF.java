package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Doctor;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface DoctorDaoIF {

    public void create(Doctor entity);

    public void delete(Doctor entity);

    public void update(Doctor entity);

    public List<Doctor> findAll();

    public Doctor findById(Long id);
}
