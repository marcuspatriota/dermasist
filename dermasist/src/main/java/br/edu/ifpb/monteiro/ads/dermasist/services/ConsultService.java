package br.edu.ifpb.monteiro.ads.dermasist.services;

import br.edu.ifpb.monteiro.ads.dermasist.dao.ConsultDao;
import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.model.Consult;
import br.edu.ifpb.monteiro.ads.dermasist.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author cassio
 */
public class ConsultService implements Serializable{
    
    @Inject
    private ConsultDao consultDao;
    
    @Transactional
    public void create(Consult consult) throws DermaSistException {
        if(consult.getDiagnosis()== null || consult.getDiagnosis().trim().equals("")){
            throw new DermaSistException("O diagnóstico da consulta é obrigatório");
        }
        
        this.consultDao.create(consult);
    }
}
