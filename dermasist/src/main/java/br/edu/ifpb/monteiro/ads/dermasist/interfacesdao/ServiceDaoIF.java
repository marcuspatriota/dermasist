package br.edu.ifpb.monteiro.ads.dermasist.interfacesdao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Service;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public interface ServiceDaoIF {
    
    public void create(Service entity);

    public void delete(Service entity);

    public void update(Service entity);

    public List<Service> findAll();

    public Service findById(Long id);
}
