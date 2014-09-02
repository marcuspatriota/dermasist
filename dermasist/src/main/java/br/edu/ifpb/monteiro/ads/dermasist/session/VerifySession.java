package br.edu.ifpb.monteiro.ads.dermasist.session;

import br.edu.ifpb.monteiro.ads.dermasist.model.Login;
import br.edu.ifpb.monteiro.ads.dermasist.util.jsf.FacesUtil;
import java.io.IOException;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Vanderlan Gomes
 */
@Named(value = "verifySession")
@SessionScoped
public class VerifySession implements Serializable {

    private static Login login;

    public void isLogged() throws IOException {
        if (getLogin() == null) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("/dermasist/Login.xhtml");
            FacesUtil.addSuccessMessage("Não logado, Redirecionando ...");
        } else {
            FacesUtil.addSuccessMessage("Logado, Tudo OK !");

        }

    }

    public static Login getLogin() {
        return login;
    }

    public static void setLogin(Login login) {
        VerifySession.login = login;
    }

}
