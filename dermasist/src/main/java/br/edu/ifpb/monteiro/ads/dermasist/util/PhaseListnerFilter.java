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
//    private static final String RESTRICTION_PATTERN = "^/restrict/.*";
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
//        if(phaseEvent.getPhaseId().equals(PhaseId.RESTORE_VIEW)){
//            
//            Session session = 
//            
//        }
//        
////        FacesContext facesContext = phaseEvent.getFacesContext();  
////        //nessa linha debaixo ta dando o NULL pointer quando chamo o getViewRoot ele me retorna nulo...  
////        String currentPage = facesContext.getViewRoot().getViewId();  
////  
////        boolean isLoginPage = (currentPage.lastIndexOf("loginGUI.jsf") > -1);  
////  
////        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);  
////  
////        //recupero meu managed bean de sessao com os dados do usuario  
////        UsuarioBean currentUser = (UsuarioBean) session.getAttribute("UsuarioBean");  
////  
////        //valida, se não for a pagina de login E o usuario não estiver logado, manda ele de volta pro login...  
////        if (!isLoginPage && !currentUser.isIsLogado()) {  
////            NavigationHandler nh = facesContext.getApplication().getNavigationHandler();  
////            nh.handleNavigation(facesContext, null, "gotoLogin");  
////        }  
//    }
//
//    @Override
//    public PhaseId getPhaseId() {
//        return PhaseId.ANY_PHASE;
//    }
//}
