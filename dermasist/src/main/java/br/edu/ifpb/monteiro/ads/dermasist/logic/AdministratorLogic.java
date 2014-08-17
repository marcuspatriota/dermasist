package br.edu.ifpb.monteiro.ads.dermasist.logic;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Administrator;
import br.edu.ifpb.monteiro.ads.dermasist.entities.Doctor;
import br.edu.ifpb.monteiro.ads.dermasist.entities.Patient;
import br.edu.ifpb.monteiro.ads.dermasist.entities.Payment;
import br.edu.ifpb.monteiro.ads.dermasist.entities.Product;
import br.edu.ifpb.monteiro.ads.dermasist.entities.Provider;
import java.util.List;

/**
 *
 * @author MarkusPatriota
 */
public class AdministratorLogic extends Administrator{
    
    private Patient patient;
    private Product product;
   
    
    public AdministratorLogic(){
        patient= new Patient();
    }
     
    public Product cadastreProduct(Product product){
        return null;
    }
    
    public Provider cadastreProvider(){
        return null;
    }
    
    public String checkTimeDoctor(Doctor doctor){
        return null;
    }
    
    public List<Payment> payments(){
        return null;
    }
    
    public List<Product> products(){
        return null;
    }
    
    
}