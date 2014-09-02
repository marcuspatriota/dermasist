package br.edu.ifpb.monteiro.ads.dermasist.session;

import br.edu.ifpb.monteiro.ads.dermasist.dao.LoginDao;
import br.edu.ifpb.monteiro.ads.dermasist.model.Login;
import javax.ejb.Stateless;

/**
 *
 * @author Vanderlan Gomes
 */
@Stateless
public class AuthenticRemoteBean implements AuthenticRemote {

    private LoginDao<Login> loginDao = new LoginDao<>(Login.class);
    private Login logged = null;

    @Override
    public boolean authentic(String login, String password) {

        logged = loginDao.findByLoginl(login, password);
        if(logged == null){
            
            System.out.println("USUÁRIO E SENHA INVÁLIDO");
            return false;
        }
        else{
            VerifySession.setLogin(logged);
            return true;
        }
        
    }
}
