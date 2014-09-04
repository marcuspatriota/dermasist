package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Secretary;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface SecretaryDaoIF {

    public void create(Secretary entity);

    public void delete(Secretary entity);

    public void update(Secretary entity);

    public List<Secretary> findAll();

    public Secretary findById(Long id);
}
