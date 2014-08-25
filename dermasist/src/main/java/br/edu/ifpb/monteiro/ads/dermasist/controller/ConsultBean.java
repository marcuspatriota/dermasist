package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.dao.ConsultDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.services.ConsultService;
import br.edu.ifpb.monteiro.ads.dermasist.model.Consult;
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
public class ConsultBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ConsultService consultService;
    
    //Only used for get data from database without filter or rule to be applied
    @Inject
    private ConsultDao consultDao;
    
    //A list to storage the data come from database
    private List<Consult> consults;
    private Consult consult;

    public ConsultBean() {

    }

    @PostConstruct
    public void init() {
        this.clean();
    }

    private void clean() {
        this.consult = new Consult();
    }

    public void create() {
        try {
            this.consultService.create(consult);
            FacesUtil.addSuccessMessage("Consulta cadastrada com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }

    /**
     * @return the consult
     */
    public Consult getConsult() {
        return consult;
    }

    /**
     * @param consult the consult to set
     */
    public void setConsult(Consult consult) {
        this.consult = consult;
    }
    
    
    public List<Consult> getConsults() {
        consults = consultDao.findAll();
        return consults;
    }
}
