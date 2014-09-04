package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Consult;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface ConsultDaoIF {

    public void create(Consult entity);

    public void delete(Consult entity);

    public void update(Consult entity);

    public List<Consult> findAll();

    public Consult findById(Long id);
}
