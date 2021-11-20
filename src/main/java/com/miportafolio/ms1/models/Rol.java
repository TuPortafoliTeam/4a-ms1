package com.miportafolio.ms1.models;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


@Entity
public class Rol {
    @Id
    @GeneratedValue
    private long idRol;
    private String nombre;
    private long idTipoEntidad;

    public Rol(long idRol, String nombre, long idTipoEntidad) {
        this.idRol = idRol;
        this.nombre = nombre;
        this.idTipoEntidad = idTipoEntidad;
    }

    public long getIdRol() {
        return idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public long getIdTipoEntidad() {
        return idTipoEntidad;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdTipoEntidad(long idTipoEntidad) {
        this.idTipoEntidad = idTipoEntidad;
    }
}
