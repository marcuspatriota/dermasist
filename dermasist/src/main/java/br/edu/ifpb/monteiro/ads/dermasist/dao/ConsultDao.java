package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.ConsultDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Consult;

/**
 *
 * @author cassio, modifield by Vanderlan Gomes
 */
public class ConsultDao extends AbstractDAO<Consult> implements ConsultDaoIF<Consult>{

    public ConsultDao() {
        super(Consult.class);
    }
}
