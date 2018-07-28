package com.viking.software;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class UsuarioBean {
    
    private String nombre;
    
    private String clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public String login(){
        String pagina;
        
        if(nombre.equalsIgnoreCase("marcosmh") && clave.equalsIgnoreCase("123") ) {
            pagina = "saludo";
        } else {
            pagina = "index";
        }
        
        return pagina;
    }
    
}
