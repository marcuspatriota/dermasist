/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.model.Login;
import java.io.Serializable;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author jefferson
 */
@Model
public class UserBean implements Serializable {
    
    @Inject
    Login user;
    
    
    
    
}
