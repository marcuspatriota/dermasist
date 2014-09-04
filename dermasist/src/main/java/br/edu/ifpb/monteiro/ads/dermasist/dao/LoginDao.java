package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.LoginDaoIF;

/**
 *
 * @author Vanderlan Gomes
 * @param <Login>
 */
public class LoginDao<Login> extends AbstractDAO<Login> implements LoginDaoIF{

    public LoginDao(Class<Login> entityClass) {
        super(entityClass);
    }

}
     
