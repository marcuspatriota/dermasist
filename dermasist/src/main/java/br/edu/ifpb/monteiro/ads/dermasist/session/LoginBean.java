package br.edu.ifpb.monteiro.ads.dermasist.session;


import br.edu.ifpb.monteiro.ads.dermasist.model.Login;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Managed Bean used for controlling user access through login and password
 * @author Vanderlan Gomes
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean implements Serializable {

    private String user;
    private String password;

    @Inject
    private AuthenticRemote loginRemote;
    private boolean logged = false;
    private Login login;
    
    public LoginBean() {

    }
    /***
     * Method that checks if the login user is valid and if yes directs the user to the home page
     * of the system if a message is invalid the user is shown
     * @return 
     */
    public String verify() {

        VerifySession.setLogin(null);
        return null;
    }

    /***
     * Method used to terminate the user session
     * 
     */
     
    public void loguot() {

  
    
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

}
