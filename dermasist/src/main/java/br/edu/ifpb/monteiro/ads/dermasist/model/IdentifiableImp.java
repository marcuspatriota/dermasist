package br.edu.ifpb.monteiro.ads.dermasist.model;

/**
 *
 * @author Vanderlan Gomes
 * @param <T>
 */
public abstract class IdentifiableImp<T> implements IdentifiableIF{

    private long ID;
    
    @Override
    public abstract Long getID() ;

    @Override
    public abstract void setID(Long id) ;
    
}
