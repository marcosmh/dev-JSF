package com.viking.software.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

@ManagedBean
@RequestScoped
public class FaseBean {
    
    public void evaluarFase(PhaseEvent event) throws Exception {
        try {
            
            if(PhaseId.APPLY_REQUEST_VALUES.equals(event.getPhaseId())) {
                System.out.println("Fase: " + PhaseId.APPLY_REQUEST_VALUES);
            }
            
            if(PhaseId.INVOKE_APPLICATION.equals(event.getPhaseId())) {
                System.out.println("Fase: " + PhaseId.INVOKE_APPLICATION);
            }
            
            if(PhaseId.RENDER_RESPONSE.equals(event.getPhaseId())) {
                System.out.println("Fase: " +  PhaseId.RENDER_RESPONSE);
            }
            
        } catch(Exception e) {
            System.out.println("Exception : "+e);
        }
    }
    
    public String submit() {
        System.out.println("Acción Enviada");
        return "index.xhtml";
    }
}
