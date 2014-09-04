package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Administrator;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface AdministratorDaoIF{

    public void create(Administrator entity);

    public void delete(Administrator entity);

    public void update(Administrator entity);

    public List<Administrator> findAll();

    public Administrator findById(Long id);
}
