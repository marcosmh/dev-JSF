package com.viking.software.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@RequestScoped
public class CuidadBean {
    
    private String codPais;
    
    private String codCiudad;
    
    private String nombre;
    
    private List<String> listaCuidad = new ArrayList<String>();

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getListaCuidad() {
        return listaCuidad;
    }

    public void setListaCuidad(List<String> listaCuidad) {
        this.listaCuidad = listaCuidad;
    }

    public void cargarCuidades(AjaxBehaviorEvent event) {
        
        switch(codPais) {
            case "1":
                listaCuidad.add("QUERETARO");
                listaCuidad.add("TABASCO");
                break;
            case "2":
                listaCuidad.add("LIMA");
                listaCuidad.add("CUZCO");
                break;
            default:
                break;
        }
    }
    
    public void cargarCuidadPrime(){
        
        switch(codPais) {
            case "1":
                listaCuidad.add("QUERETARO");
                listaCuidad.add("TABASCO");
                break;
            case "2":
                listaCuidad.add("LIMA");
                listaCuidad.add("CUZCO");
                break;
            default:
                break;
        }
    }
    
}
