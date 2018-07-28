package com.viking.software.beans;

import com.viking.software.clases.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean
@RequestScoped
public class personaBean {

    private Persona persona = new Persona();
    
    private static List<Persona> listaPersonas = new ArrayList();

       
    public personaBean() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        personaBean.listaPersonas = listaPersonas;
    }

   
    public void agregarPersona() {
        personaBean.listaPersonas.add(this.persona);
    }
  
    public void eliminarPersona(Persona per) {
        personaBean.listaPersonas.remove(per);
    }
    
}
