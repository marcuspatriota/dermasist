package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Administrator;
import java.util.List;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class AdministratorDao extends AbstractDAO<Administrator> {

    public AdministratorDao() {
        super(Administrator.class);
    }

    @Override
    public List<Administrator> findAll() {
        return getEntityManager().createQuery("from Administrator adm").getResultList();
    }

}
