package br.edu.ifpb.monteiro.ads.dermasist.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author Vanderlan Gomes
 */
@Stateless
public class AuthenticRemoteBean implements AuthenticRemote {

    private EntityManager entityManager;

    @Override
    public boolean authentic(String login, String password) {

//        UserBibliosoft user = new UserBibliosoft();
//        user.setPassword(password);
//        user.setRegistration(login);
//
//        UserBibliosoft find = entityManager.find(UserBibliosoft.class, user);
//
//        if (find.getId() != null) {
//            return true;
//        } else {
//            return "admin".equals(login) && "admin".equals(password);
//
//        }
//
//    }
        return "admin".equals(login) && "admin".equals(password);

    }
}
