package com.miportafolio.ms1.models;

import org.springframework.data.annotation.Id;

public class Rol {
    @Id
    private long IdRol;
    private String Nombre;
    private long IdTipoEntidad;

    public Rol(long IdRol, String nombre, long idTipoEntidad) {
        this.IdRol=IdRol;
        this.Nombre = nombre;
        this.IdTipoEntidad = idTipoEntidad;
    }

    public void setIdRol(long idRol) {
        this.IdRol = idRol;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setIdTipoEntidad(long idTipoEntidad) {
        this.IdTipoEntidad = idTipoEntidad;
    }

    public long getIdRol() {
        return IdRol;
    }

    public String getNombre() {
        return Nombre;
    }

    public long getIdTipoEntidad() {
        return IdTipoEntidad;
    }
}
