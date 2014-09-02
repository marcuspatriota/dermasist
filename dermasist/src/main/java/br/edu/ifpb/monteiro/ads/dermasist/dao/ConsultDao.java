package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.model.Consult;
import java.util.List;

/**
 *
 * @author cassio, modifield by Vanderlan Gomes
 */
public class ConsultDao extends AbstractDAO<Consult>{

    public ConsultDao() {
        super(Consult.class);
    }

    @Override
    public List<Consult> findAll() {
        return getEntityManager().createQuery("from Consult cons").getResultList();
    }

}
