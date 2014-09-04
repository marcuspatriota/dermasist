package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Patrimony;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface PatrimonyDaoIF {

    public void create(Patrimony entity);

    public void delete(Patrimony entity);

    public void update(Patrimony entity);

    public List<Patrimony> findAll();

    public Patrimony findById(Long id);
}
