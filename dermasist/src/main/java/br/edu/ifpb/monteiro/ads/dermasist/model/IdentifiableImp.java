package br.edu.ifpb.monteiro.ads.dermasist.model;

/**
 *
 * @author vanderlan
 */
public abstract class IdentifiableImp implements IdentifiableIF{

    @Override
    public abstract Long getID() ;

    @Override
    public abstract void setID(Long id) ;
    
}
