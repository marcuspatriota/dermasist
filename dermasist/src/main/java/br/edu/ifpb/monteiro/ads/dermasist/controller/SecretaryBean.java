package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Secretary;
import br.edu.ifpb.monteiro.ads.dermasist.services.SecretaryService;
import br.edu.ifpb.monteiro.ads.dermasist.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import org.primefaces.model.SelectableDataModel;

/**
 * Controller to manage the communication between the page and the rest of project
 * 
 * @author cassio
 */
@Model
public class SecretaryBean implements Serializable{
    
    @Inject
    private SecretaryService secretaryService;

    private List<Secretary> secretaries;
    
    private Secretary secretary;
    
    private Secretary selectSercretary;
    
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
        this.secretary = new Secretary();
        this.selectSercretary = new Secretary();
    }
    
    private void clean() {
    
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
        secretaries = secretaryService.findAll();
        return secretaries;
    }

    public Secretary getSelectSercretary() {
        return selectSercretary;
    }

    public void setSelectSercretary(Secretary selectSercretary) {
        this.selectSercretary = selectSercretary;
    }

    public SecretaryService getSecretaryService() {
        return secretaryService;
    }

    public void setSecretaries(List<Secretary> secretaries) {
        this.secretaries = secretaries;
    }
     
}
