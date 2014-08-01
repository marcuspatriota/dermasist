package br.edu.ifpb.monteiro.ads.dermasist.test;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Login;
import br.edu.ifpb.monteiro.ads.dermasist.exception.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.facade.LoginFacade;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Elisângela
 */
public class LoginTest {
    
    private static LoginFacade loginFacade;
    private static List<Login> loginList;
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws DermaSistException {
        loginFacade = new LoginFacade();
        loginList = new ArrayList<Login>();
    }
    
    @Test
    public static void login() throws DermaSistException {
        
        // Entradas válidas
        assertEquals(true, loginFacade.login("Elisângela", "123456"));
        assertEquals(true, loginFacade.login("MarkusPatriota", "123"));
        
        // Adiconando usuários no arrayList
        loginList.add(new Login("Elisângela", "123456"));
        loginList.add(new Login("MarkusPatriota", "123"));
        
        // Entradas inválidas
        assertEquals(false, loginFacade.login("23456789", "435436546"));
        assertEquals(false, loginFacade.login("!Maria$%&*+-", "7452q3483"));
        assertEquals(false, loginFacade.login("", "7746536576"));
        assertEquals(false, loginFacade.login("Markus", ""));
    }
    
    @Test
    public static void editUser() throws DermaSistException {
        
        // Edições válidas
        assertEquals(true, loginFacade.editUser("Markuspatriota", "4564735vb"));
        assertEquals(true, loginFacade.editUser("Wilde ", "@835745%hteu"));
        
        // Edições inválidas
        assertEquals(false, loginFacade.editUser("", "123456"));
        assertEquals(false, loginFacade.editUser("Wilde", ""));
    }
    

    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() throws DermaSistException {
        // Excluindo logins usuários
        loginFacade.deleteUser(new Login("Elisângela", "123456"));
        loginFacade.deleteUser(new Login("MarkusPatriota", "123"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
