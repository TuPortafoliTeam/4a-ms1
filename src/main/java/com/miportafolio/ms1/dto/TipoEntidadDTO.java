package com.miportafolio.ms1.dto;

public class TipoEntidadDTO {
    private Long idTipoEntidad;
    private String nombre;

    public TipoEntidadDTO() {
    }

    public TipoEntidadDTO(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdTipoEntidad() {
        return idTipoEntidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdTipoEntidad(Long idTipoEntidad) {
        this.idTipoEntidad = idTipoEntidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
