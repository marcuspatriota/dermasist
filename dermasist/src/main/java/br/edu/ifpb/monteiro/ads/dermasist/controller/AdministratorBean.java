package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.dao.AdministratorDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.services.AdministratorService;
import br.edu.ifpb.monteiro.ads.dermasist.model.Administrator;
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
public class AdministratorBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private AdministratorService administratorService;
    
    //Only used for get data from database without filter or rule to be applied
    @Inject
    private AdministratorDao administratorDao;
    
    //A list to storage the data come from database
    private List<Administrator> administrators;
    private Administrator administrator;

    public AdministratorBean() {
        
    }
    
    @PostConstruct
    public void init(){
        this.clean();
    }
    
    private void clean() {
        this.administrator = new Administrator();
    }

    public void create() {
        try {
            this.administratorService.create(administrator);
            FacesUtil.addSuccessMessage("Administrador cadastrado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }

    /**
     * @return the administrator
     */
    public Administrator getAdministrator() {
        return administrator;
    }

    /**
     * @param administrator the administrator to set
     */
    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    /**
     * @return the administrators
     */
    public List<Administrator> getAdministrators() {
        administrators = administratorDao.findAll();
        return administrators;
    }
}
