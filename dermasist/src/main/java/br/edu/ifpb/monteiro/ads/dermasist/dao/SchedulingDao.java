package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.SchedulingDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Scheduling;

/**
 *
 * @author Vanderlan Gomes
 */
public class SchedulingDao extends AbstractDAO<Scheduling> implements SchedulingDaoIF{

    public SchedulingDao() {
        super(Scheduling.class);
    }
    
}
