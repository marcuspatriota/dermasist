package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidade de Login contém atribudos e métodos de criação de uma 
 * login.
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

    // Get's e Set's
    
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.ID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Login{" + "ID=" + ID + ", login=" + login + ", password=" + password + '}';
    }
      
 }
