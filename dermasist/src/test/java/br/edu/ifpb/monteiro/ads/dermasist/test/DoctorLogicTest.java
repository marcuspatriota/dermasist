package br.edu.ifpb.monteiro.ads.dermasist.test;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Consult;
import br.edu.ifpb.monteiro.ads.dermasist.entities.Patient;
import br.edu.ifpb.monteiro.ads.dermasist.entities.Scheduling;
import br.edu.ifpb.monteiro.ads.dermasist.facade.DoctorLogic;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MarkusPatriota
 */
public class DoctorLogicTest {
    
    private static DoctorLogic instance;
    private static Patient patient;
    
    
    public DoctorLogicTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new DoctorLogic();
        patient = new Patient();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCreateConsult() {
        System.out.println("Method Test: "+"createConsult");
        patient= new Patient();
        patient.setCpf("12345677902");
        patient.setName("MArkus");
        Consult expResult = null;
        Consult result = instance.createConsult(patient);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testEditConsult() {
        System.out.println("Method Test: "+"editConsult");
        patient = null;
        Consult consult = null;
        Consult expResult = null;
        Consult result = instance.editConsult(patient, consult);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testFindConsult() {
        System.out.println("Method Test: "+"findConsult");
        Object object = null;
        Consult expResult = null;
        Consult result = instance.findConsult(object);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCreateScheduling() {
        System.out.println("Method Test: "+"createScheduling");
        patient = null;
        Scheduling expResult = null;
        Scheduling result = instance.createScheduling(patient);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testPassMedication() {
        System.out.println("Method Test: "+"passMedication");
        String medication = "Remédio";
        String expResult = "Remédio";
        String result = instance.passMedication(medication);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testRealizeDiagnosis() {
        System.out.println("Method Test: "+"realizeDiagnosis");
        String diagnosis = "Fungo";
        String expResult = "Fungo";
        String result = instance.realizeDiagnosis(diagnosis);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testPrescribesExam() {
        System.out.println("Method Test: "+"prescribesExam");
        String exam = "Aplição de Médicação no Local Afetado";
        String expResult = "Aplição de Médicação no Local Afetado";
        String result = instance.prescribesExam(exam);
        assertEquals(expResult, result);
        
    }
    
}
