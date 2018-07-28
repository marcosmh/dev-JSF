package com.viking.software.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;


@ManagedBean
@RequestScoped
public class PersonaBean {
    
    private Persona persona = new Persona();
    
    private List<Persona> listPersonas = new ArrayList<Persona>();

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getListPersonas() {
        return listPersonas;
    }

    public void setListPersonas(List<Persona> listPersonas) {
        this.listPersonas = listPersonas;
    }
    
    public void registrar() {
        this.listPersonas.add(this.persona);
    }
    
    public void validar(FacesContext context,
            UIComponent toValidate, Object value) {
        
        context = FacesContext.getCurrentInstance();
        String texto = (String) value;
        
        if(!texto.equalsIgnoreCase("M") && !texto.equalsIgnoreCase("F")) {
            ((UIInput) toValidate).setValid(false);
            context.addMessage(toValidate.getClientId(context), new FacesMessage("Sexo No Valido"));
        }
    }
    
}
