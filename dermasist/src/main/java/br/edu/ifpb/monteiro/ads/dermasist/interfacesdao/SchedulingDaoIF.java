package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Scheduling;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface SchedulingDaoIF {

    public void create(Scheduling entity);

    public void delete(Scheduling entity);

    public void update(Scheduling entity);

    public List<Scheduling> findAll();

    public Scheduling findById(Long id);
}
