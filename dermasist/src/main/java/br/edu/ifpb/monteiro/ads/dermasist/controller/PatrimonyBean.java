package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.services.PatrimonyService;
import br.edu.ifpb.monteiro.ads.dermasist.model.Patrimony;
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
public class PatrimonyBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private PatrimonyService patrimonyService;
    
    //A list to storage the data come from database
    private List<Patrimony> patrimonies;
    @Inject
    private Patrimony patrimony;

    public PatrimonyBean() {
        
    }
    
    @PostConstruct
    public void init(){
        this.clean();
    }
    
    private void clean() {
        this.patrimony = new Patrimony();
    }

    public void create() {
        try {
            this.patrimonyService.create(patrimony);
            FacesUtil.addSuccessMessage("Patrimônio cadastrado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }

    /**
     * @return the patrimony
     */
    public Patrimony getPatrimony() {
        return patrimony;
    }

    /**
     * @param patrimony the patrimony to set
     */
    public void setPatrimony(Patrimony patrimony) {
        this.patrimony = patrimony;
    }
    
    public List<Patrimony> getPatrimonies() {
        patrimonies = patrimonyService.findAll();
        return patrimonies;
    }
}
