//package br.edu.ifpb.monteiro.ads.dermasist.util;
//
//import javax.faces.application.NavigationHandler;
//import javax.faces.context.FacesContext;
//import javax.faces.event.PhaseEvent;
//import javax.faces.event.PhaseId;
//import javax.faces.event.PhaseListener;
//import javax.servlet.http.HttpSession;
//
///**
// * Implementation of Phase Listner based on example in site:
// * http://rodrigolazoti.com.br/2008/09/01/filtrando-usuarios-logados-em-jsf-com-phaselistener/
// *
// * @author Rodrigo Lazoti
// */
//public class PhaseListnerFilter implements PhaseListener {
//
//    @Override
//    public void afterPhase(PhaseEvent phaseEvent) {
//        FacesContext facesContext = phaseEvent.getFacesContext();
//        String currentPage = facesContext.getViewRoot().getViewId();
//
//        boolean isLoginPage = (currentPage.lastIndexOf("login.xhtml") > -1);
//        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
//        Object currentUser = session.getAttribute("currentUser");
//
//        if (!isLoginPage && currentUser == null) {
//            NavigationHandler navigationHandler = facesContext.getApplication().getNavigationHandler();
//            navigationHandler.handleNavigation(facesContext, null, "loginPage");
//        }
//    }
//
//    @Override
//    public void beforePhase(PhaseEvent phaseEvent) {
//        
//    }
//
//    @Override
//    public PhaseId getPhaseId() {
//        return PhaseId.RESTORE_VIEW;
//    }
//}
