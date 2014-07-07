package br.edu.ifpb.monteiro.ads.dermasist.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "login")
@ViewScoped
public class LoginBean implements Serializable{
    
    private String username;
    private String password;
    
    public void print(){
        System.out.println("Bem vindo " + username);
        System.out.println("Sua senha é " + password);
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
