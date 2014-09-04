package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Login;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface LoginDaoIF {

    public void create(Login entity);

    public void delete(Login entity);

    public void update(Login entity);

    public List<Login> findAll();

    public Login findById(Long id);
}
