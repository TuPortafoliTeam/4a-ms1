package com.miportafolio.ms1.dto;

public class RolDTO {
    private Long idRol;
    private String nombre;
    private Long idTipoEntidad;

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

    public Long getIdTipoEntidad() {
        return idTipoEntidad;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdTipoEntidad(Long tipoEntidad) {
        this.idTipoEntidad = tipoEntidad;
    }
}
