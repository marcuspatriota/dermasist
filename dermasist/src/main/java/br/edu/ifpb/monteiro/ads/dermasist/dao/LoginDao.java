package br.edu.ifpb.monteiro.ads.dermasist.dao;

/**
 *
 * @author Vanderlan Gomes
 * @param <Login>
 */
public class LoginDao<Login> extends AbstractDAO<Login>{

    public LoginDao(Class<Login> entityClass) {
        super(entityClass);
    }

}
     
