package com.miportafolio.ms1.models;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "funcionalidad")
public class Funcionalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private long idFuncionalidad;
    private String nombre;
    private String url;

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
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Funcionalidad() {
    }

}