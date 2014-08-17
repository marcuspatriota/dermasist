package br.edu.ifpb.monteiro.ads.dermasist.model;

import br.edu.ifpb.monteiro.ads.dermasist.dao.LoginDao;
import br.edu.ifpb.monteiro.ads.dermasist.exception.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.logic.LoginIF;
import br.edu.ifpb.monteiro.ads.dermasist.validation.LoginValidation;

/**
 *
 * @author cassio
 */
public class Login implements LoginIF {

    LoginValidation loginValidation = new LoginValidation();

    @Override
    public boolean login(String user, String password) {
        if (loginValidation.isUserBlank(user) == false && 
            loginValidation.isPasswordBlank(password) == false) {
            LoginDao loginDao = new LoginDao();
            String teste = loginDao.find(user).toString();
            System.out.println("O TEXTO É: " + teste);
        }

        return false;
    }

    @Override
    public boolean editUser(String user, String password) throws DermaSistException {
        return false;
    }

    @Override
    public boolean deleteUser(br.edu.ifpb.monteiro.ads.dermasist.entities.Login login) throws DermaSistException {
        return false;
    }
}
