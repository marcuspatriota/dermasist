package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.services.ProviderService;
import br.edu.ifpb.monteiro.ads.dermasist.model.Provider;
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
public class ProviderBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ProviderService providerService;
    
    //A list to storage the data come from database
    private List<Provider> providers;
    private Provider provider;

    public ProviderBean() {
        
    }
    
    @PostConstruct
    public void init(){
        this.clean();
    }
    
    private void clean() {
        this.provider = new Provider();
    }

    public void create() {
        try {
            this.providerService.create(provider);
            FacesUtil.addSuccessMessage("Fornecedor cadastrado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }

    /**
     * @return the provider
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(Provider provider) {
        this.provider = provider;
    }
    
    public List<Provider> getProviders() {
        providers = providerService.findAll();
        return providers;
    }
}
