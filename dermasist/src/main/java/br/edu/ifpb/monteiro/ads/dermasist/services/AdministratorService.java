package br.edu.ifpb.monteiro.ads.dermasist.services;


import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.AdministratorDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Administrator;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class AdministratorService implements  Serializable{
       
    @Inject
    private AdministratorDaoIF dao;

    public void create(Administrator entity) throws DermaSistException {
       dao.create(entity);
    }

    public void delete(Administrator entity) throws DermaSistException {
        dao.delete(entity);
    }

    public void update(Administrator entity) throws DermaSistException {
        dao.update(entity);
    }

    public Administrator findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }
    
    public List<Administrator> findAll() {
       
        return dao.findAll();
    
    }

}
