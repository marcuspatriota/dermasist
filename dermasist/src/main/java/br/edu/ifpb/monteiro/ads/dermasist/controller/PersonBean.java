package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.enumerations.States;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.enterprise.inject.Model;

/**
 * Controller to manage the communication between the page and the rest of project
 * 
 * @author cassio
 */
@Model
public class PersonBean implements Serializable {

    private static final long serialVersionUID = 1L;

    //This attribute will receive the states of the Enumeration States 
    private  List<States> states;

    public PersonBean() {
        //Initializing list and receiving the valus of States Enumeration as a List.
       states = Arrays.asList(States.values());
    }

    public Date getDateToday() {
        return new Date();
    }

    public  List<States> getStates() {
        return states;
    }
    
}
