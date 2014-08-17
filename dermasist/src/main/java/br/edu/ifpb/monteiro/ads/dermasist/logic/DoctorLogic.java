package br.edu.ifpb.monteiro.ads.dermasist.logic;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Consult;
import br.edu.ifpb.monteiro.ads.dermasist.entities.Doctor;
import br.edu.ifpb.monteiro.ads.dermasist.entities.Patient;
import br.edu.ifpb.monteiro.ads.dermasist.entities.Scheduling;

/**
 *
 * @author MarkusPatriota
 */
public class DoctorLogic extends Doctor{
    
    private Consult consult;
    
    public DoctorLogic(){
        consult= new Consult();
        
    }
 
    public Consult createConsult(Patient patient){
        return null;
    }
    
    public Consult editConsult(Patient patient, Consult consult){
        return null;
    }
    
    public Consult findConsult(Object object){
        return null;
    }
    
    public Scheduling createScheduling(Patient patient){
        return null;
    }
    
    public String passMedication(String medication ){
        return null;
    }
    
    public String realizeDiagnosis(String diagnosis){
        return null;
    }
    
    public String prescribesExam(String exam){
        return null;
    }
    
}