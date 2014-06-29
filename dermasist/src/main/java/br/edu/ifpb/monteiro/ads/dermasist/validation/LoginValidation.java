
package br.edu.ifpb.monteiro.ads.dermasist.validation;

/**
 *
 * @author cassio
 */
public class LoginValidation {

    public boolean isUserBlank(String user) {
        try {
            return user.isEmpty();
        } catch (NullPointerException nullError) {
            nullError.getMessage();
        }
        return false;
    }

    public boolean isPasswordBlank(String password) {
        try {
            return password.isEmpty();
        } catch (NullPointerException nullError) {
            nullError.getMessage();
        }
        return false;
    }
}
    