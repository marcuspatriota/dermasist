package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.SecretaryDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Secretary;

/**
 *
 * @author cassio, modifield by Vanderlan Gomes
 */
public class SecretaryDao extends AbstractDAO<Secretary> implements SecretaryDaoIF{

    public SecretaryDao() {
        super(Secretary.class);
    }
    
}
