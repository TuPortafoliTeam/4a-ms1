package com.miportafolio.ms1.models;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class RolFuncionalidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long idRolFuncionalidad;
    private Long idRol;
    private Long idFuncionalidad;

    public RolFuncionalidad(Long idRolFuncionalidad, Long idRol, Long idFuncionalidad){
        this.idRolFuncionalidad = idRolFuncionalidad;
        this.idRol = idRol;
        this.idFuncionalidad = idFuncionalidad;
    }

    public RolFuncionalidad() {
    }

    public Long getIdRolFuncionalidad() {
        return idRolFuncionalidad;
    }

    public void setIdRolFuncionalidad(Long idRolFuncionalidad) {
        this.idRolFuncionalidad = idRolFuncionalidad;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public Long getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(Long idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }
}
