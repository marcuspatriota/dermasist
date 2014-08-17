package br.edu.ifpb.monteiro.ads.dermasist.logic;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Login;
import br.edu.ifpb.monteiro.ads.dermasist.exception.DermaSistException;


/**
 *
 * @author Elisângela
 */
public class LoginFacade implements LoginIF {

    @Override
    public boolean login(String user, String password) throws DermaSistException {
       return false;
    }

    @Override
    public boolean editUser(String user, String password) throws DermaSistException {
        return false;
    }
    
    @Override
    public boolean deleteUser(Login login) throws DermaSistException {
        return false;
    }

    
    
}
