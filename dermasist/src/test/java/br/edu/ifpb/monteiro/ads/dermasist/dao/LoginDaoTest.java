package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Login;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Markus
 */
public class LoginDaoTest {
    
    private static EJBContainer container;
    
    public LoginDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
//        Map<String, Object> properties = new HashMap<>();
//        properties.put(EJBContainer.MODULES, new File("build/jar"));
//        container = EJBContainer.createEJBContainer(properties);
//        System.out.println("Opening the container");
    }
    
    @AfterClass
    public static void tearDownClass() {
//        container.close();
//        System.out.println("Closing the container");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of create method, of class LoginDao.
     */
    @Test
    public void testCreate() throws Exception {
//        System.out.println("create");
//        Login entity = new Login();
//        entity.setLogin("Markus");
//        entity.setPassword("123");
//        LoginDao instance = (LoginDao)container.getContext().lookup("java:global/dermasist/LoginDao");
//        instance.create(entity);
//        container.close();
//        
    }
    
    /**
     * Test of edit method, of class LoginDao.
     */
    @Test
    public void testEdit() throws Exception {
        
    }
    
    /**
     * Test of remove method, of class LoginDao.
     */
    @Test
    public void testRemove() throws Exception {
        
    }
    
    /**
     * Test of find method, of class LoginDao.
     */
    @Test
    public void testFind() throws Exception {
        
    }
    
    /**
     * Test of findAll method, of class LoginDao.
     */
    @Test
    public void testFindAll() throws Exception {
        
    }
    
    /**
     * Test of findRange method, of class LoginDao.
     */
    @Test
    public void testFindRange() throws Exception {
        
    }
    
    /**
     * Test of count method, of class LoginDao.
     */
    @Test
    public void testCount() throws Exception {
        
    }
    
}
