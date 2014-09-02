package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.services.ServiceIF;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vanderlan
 * @param <T>
 */
public abstract class AbstractController<T> implements ControllerIF<T> {

    private ServiceIF service;
    private Class<T> entity;

    public AbstractController(Class<T> entityClass, ServiceIF service) {
        this.entity = entityClass;
        this.service = service;
    }

    @Override
    public void create() {
        try {
            service.create(entity);
        } catch (DermaSistException ex) {
            Logger.getLogger(AbstractController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete() {
        try {
            service.delete(entity);
        } catch (DermaSistException ex) {
            Logger.getLogger(AbstractController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update() {
        try {
            service.update(entity);
        } catch (DermaSistException ex) {
            Logger.getLogger(AbstractController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object findById(Long id) {
        try {
            return service.findById(id);
        } catch (DermaSistException ex) {
            Logger.getLogger(AbstractController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ServiceIF getService() {
        return service;
    }

    public void setService(ServiceIF service) {
        this.service = service;
    }

}
