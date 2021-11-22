package com.miportafolio.ms1.models;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Funcionalidad {

    @Id
    private long idFuncionalidad;
    private String nombre;
    private String Url;

    public long getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(long idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Funcionalidad() {
    }

}