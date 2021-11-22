package com.miportafolio.ms1.dto;

public class FuncionalidadDTO {
    private Long idFuncionalidad;
    private String nombre;
    private String Url;

    public FuncionalidadDTO() {
    }

    FuncionalidadDTO(Long idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public Long getIdFuncionalidad() {
        return this.idFuncionalidad;
    }

    public void setIdFuncionalidad(Long idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return this.Url;
    }

}