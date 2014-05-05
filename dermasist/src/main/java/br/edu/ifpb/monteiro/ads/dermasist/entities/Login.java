package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Markus
 */

@Entity
@Table(name="LOGIN")
public class Login implements IdentifiableIF{
    @Id
    private Long ID;
   
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

    @Override
    public Serializable getID() {
      return this.ID;
    }

    @Override
    public void setID(Serializable id) {
       this.ID=(Long) id;
    }
    
    
    
}
