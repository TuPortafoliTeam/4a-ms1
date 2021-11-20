package com.miportafolio.ms1.models;

import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class TipoEntidad {
    @Id
    private Long idTipoEntidad;
    private String nombre;

    public TipoEntidad(String nombre) {
        this.nombre = nombre;
    }

    public TipoEntidad() {
    }

    public Long getIdTipoEntidad() {
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
