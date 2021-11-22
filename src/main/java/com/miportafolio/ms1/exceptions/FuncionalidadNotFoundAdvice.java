package com.miportafolio.ms1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class FuncionalidadNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(FuncionalidadNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvice(FuncionalidadNotFoundException ex) {
        return ex.getMessage();
    }
}