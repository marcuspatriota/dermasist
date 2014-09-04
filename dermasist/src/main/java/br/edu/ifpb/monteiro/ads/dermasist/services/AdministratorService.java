package br.edu.ifpb.monteiro.ads.dermasist.services;


import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.AdministratorDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Administrator;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class AdministratorService implements  ServiceIF<Administrator>{
       
    @Inject
    private AdministratorDaoIF dao;

    @Override
    public void create(Administrator entity) throws DermaSistException {
       dao.create(entity);
    }

    @Override
    public void delete(Administrator entity) throws DermaSistException {
        dao.delete(entity);
    }

    @Override
    public void update(Administrator entity) throws DermaSistException {
        dao.update(entity);
    }

    @Override
    public Administrator findById(Long id) throws DermaSistException {
        return dao.findById(id);
    }
    
      @Override
    public List<Administrator> findAll() {
       
        return dao.findAll();
    
    }

}
