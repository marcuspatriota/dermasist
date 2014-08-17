package br.edu.ifpb.monteiro.ads.dermasist.logic;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Login;
import br.edu.ifpb.monteiro.ads.dermasist.exception.DermaSistException;


/**
 *
 * @author cassio
 */
public interface LoginIF {

    public boolean login(String user, String password) throws DermaSistException ;
    public boolean editUser(String user, String password) throws DermaSistException ;
    public boolean deleteUser(Login login) throws DermaSistException ;
    
}
