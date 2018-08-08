package com.viking.software.beans;

import com.viking.software.clases.Perro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PerroBean {
    
    private Perro perro = new Perro();
    
    private List<Perro> listaPerro = new ArrayList<Perro>();

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public List<Perro> getListaPerro() {
        return listaPerro;
    }

    public void setListaPerro(List<Perro> listaPerro) {
        this.listaPerro = listaPerro;
    }
    
    public void refrescar() {
                       
        Perro p1 = new Perro();
        p1.setCodigo(1);
        p1.setNombre("KAISER");
        
        Perro p2 = new Perro();
        p2.setCodigo(2);
        p2.setNombre("REX");
        
        Perro p3 = new Perro();
        p3.setCodigo(3);
        p3.setNombre("SCOBBY");
    }
    
    
}
