package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.LoginDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Login;

/**
 *
 * @author Vanderlan Gomes
 */
public class LoginDao extends AbstractDAO<Login> implements LoginDaoIF{

    public LoginDao() {
        super(Login.class);
    }

}
     
