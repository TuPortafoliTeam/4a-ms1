package com.miportafolio.ms1.dto;

public class RolFuncionalidadDTO {
    private String idRolFuncionalidad;
    private String idRol;
    private String idFuncionalidad;

    public RolFuncionalidadDTO() {
    }

    public RolFuncionalidadDTO(String idRolFuncionalidad) {
        this.idRolFuncionalidad = idRolFuncionalidad;
    }

    public RolFuncionalidadDTO(String idRolFuncionalidad, String idRol, String idFuncionalidad) {
        this.idRolFuncionalidad = idRolFuncionalidad;
        this.idRol = idRol;
        this.idFuncionalidad = idFuncionalidad;
    }

    public String getIdRolFuncionalidad() {
        return idRolFuncionalidad;
    }

    public void setIdRolFuncionalidad(String idRolFuncionalidad) {
        this.idRolFuncionalidad = idRolFuncionalidad;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(String idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }
}
