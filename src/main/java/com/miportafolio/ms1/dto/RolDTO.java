package com.miportafolio.ms1.dto;

public class RolDTO {
    private Long idRol;
    private String nombre;
    private Long tipoEntidad;

    public RolDTO() {
    }

    public RolDTO(Long idRol) {
        this.idRol = idRol;

    }

    public Long getIdRol() {
        return idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getTipoEntidad() {
        return tipoEntidad;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoEntidad(Long tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }
}
