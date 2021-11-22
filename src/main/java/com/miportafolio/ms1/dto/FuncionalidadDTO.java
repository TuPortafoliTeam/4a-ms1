package com.miportafolio.ms1.dto;

import com.miportafolio.ms1.models.TipoEntidad;

public class FuncionalidadDTO{

    private String nombre;
    private String Url;

    public FuncionalidadDTO(){
    }

    FuncionalidadDTO(String nombre){
        this.idFuncionalidad = idFuncionalidad;
    }

    FuncionalidadDTO(String Url){
        this.idFuncionalidad = idFuncionalidad;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String Url() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }



}