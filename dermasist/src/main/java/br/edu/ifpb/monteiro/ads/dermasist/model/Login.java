package br.edu.ifpb.monteiro.ads.dermasist.model;

import br.edu.ifpb.monteiro.ads.dermasist.dao.LoginDao;
import br.edu.ifpb.monteiro.ads.dermasist.facade.LoginIF;
import br.edu.ifpb.monteiro.ads.dermasist.validacao.LoginValidation;

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
}
