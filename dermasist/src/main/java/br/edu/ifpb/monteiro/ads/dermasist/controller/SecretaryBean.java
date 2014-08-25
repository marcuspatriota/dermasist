package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.dao.SecretaryDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Secretary;
import br.edu.ifpb.monteiro.ads.dermasist.services.SecretaryService;
import br.edu.ifpb.monteiro.ads.dermasist.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 * Controller to manage the communication between the page and the rest of project
 * 
 * @author cassio
 */
@Model
public class SecretaryBean implements Serializable{
    
    @Inject
    private SecretaryService secretaryService;
    
    //Only used for get data from database without filter or rule to be applied
    @Inject
    private SecretaryDao secretaryDao;
    
    //A list to storage the data come from database
    private List<Secretary> secretaries;
    
    private Secretary secretary;
    
    public SecretaryBean(){
        
    }
    
    public void create() {
        try {
            this.secretaryService.create(secretary);
            FacesUtil.addSuccessMessage("Secretário(a) cadastrado(a) com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }
    
    @PostConstruct
    public void init(){
        this.clean();
    }
    
    private void clean() {
        this.setSecretary(new Secretary());
    }

    /**
     * @return the secretary
     */
    public Secretary getSecretary() {
        return secretary;
    }

    /**
     * @param secretary the secretary to set
     */
    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public List<Secretary> getSecretaries() {
        secretaries = secretaryDao.findAll();
        return secretaries;
    }
    
}
