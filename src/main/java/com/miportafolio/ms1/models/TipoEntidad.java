package com.miportafolio.ms1.models;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


@Entity
public class TipoEntidad {
    @Id
    @GeneratedValue
    private long idTipoEntidad;
    private String nombre;

    public TipoEntidad(long idTipoEntidad, String nombre) {
        this.idTipoEntidad = idTipoEntidad;
        this.nombre = nombre;
    }

    public long getIdTipoEntidad() {
        return idTipoEntidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdTipoEntidad(long idTipoEntidad) {
        this.idTipoEntidad = idTipoEntidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
