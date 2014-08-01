package br.edu.ifpb.monteiro.ads.dermasist.test;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Person;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Classe PersonTest, responsável pelos testes para simular os casos de uso provaveis.
 * @author Elisângela
 */
public class PersonTest {
   
    public PersonTest() {
    }
    
    // Esta anotação cria vários acessos ao banco de acordo com a quantidade de teste existentes
    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    // Esta anotação cria apenas um acesso ao banco para todas os testes.
    @Before
    public void setUp() {
       
    }    
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
