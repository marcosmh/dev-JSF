package com.viking.software.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;


public class FaseListener implements PhaseListener{
    
    private static final long serialVersionUID = 1L;
    
    @Override
    public void afterPhase(PhaseEvent e) {
        System.out.println("After Fase: " + e.getPhaseId());
    }
    
    @Override
    public void beforePhase(PhaseEvent e) {
        System.out.println("Before Fase: " + e.getPhaseId());
    }
    
    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
