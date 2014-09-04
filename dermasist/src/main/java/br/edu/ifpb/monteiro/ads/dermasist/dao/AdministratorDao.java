package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.AdministratorDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Administrator;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class AdministratorDao extends AbstractDAO<Administrator> implements AdministratorDaoIF{

    public AdministratorDao() {
        super(Administrator.class);
    }

}
