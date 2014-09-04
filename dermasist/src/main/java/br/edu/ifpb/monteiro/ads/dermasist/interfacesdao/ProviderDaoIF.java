package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Provider;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface ProviderDaoIF {

    public void create(Provider entity);

    public void delete(Provider entity);

    public void update(Provider entity);

    public List<Provider> findAll();

    public Provider findById(Long id);
}
