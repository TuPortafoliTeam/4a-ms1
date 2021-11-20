package com.miportafolio.ms1.dto;

public class ResponseDTO {
    private boolean exitoso;
    private String mensajeError;
    private Object body;

    public ResponseDTO(boolean exitoso, String mensajeError) {
        this.exitoso = exitoso;
        this.mensajeError = mensajeError;
    }

    public ResponseDTO(boolean exitoso, String mensajeError, Object body) {
        this.exitoso = exitoso;
        this.mensajeError = mensajeError;
        this.body = body;
    }

    public boolean isExitoso() {
        return this.exitoso;
    }

    public boolean getExitoso() {
        return this.exitoso;
    }

    public void setExitoso(boolean exitoso) {
        this.exitoso = exitoso;
    }

    public String getMensajeError() {
        return this.mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public Object getBody() {
        return this.body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

}
