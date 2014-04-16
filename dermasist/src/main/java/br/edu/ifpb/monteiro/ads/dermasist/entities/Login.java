package br.edu.ifpb.monteiro.ads.dermasist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Markus
 */

@Entity
@Table(name="LOGIN")
public class Login extends Identifiable{
   
    @Column(name="LOGIN")
    private String login;
    @Column(name="POSSWORD")
    private String password;

    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
