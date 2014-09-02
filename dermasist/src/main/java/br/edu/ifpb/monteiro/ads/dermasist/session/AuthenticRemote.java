
package br.edu.ifpb.monteiro.ads.dermasist.session;

import javax.ejb.Remote;

/**
 *
 * @author vanderlan
 */
@Remote
public interface AuthenticRemote {
    
    public boolean authentic(String login, String password);
    
    
}
