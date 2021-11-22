package com.miportafolio.ms1.controllers;

import com.miportafolio.ms1.models.Funcionalidad;
import com.miportafolio.ms1.repositories.FuncionalidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public class FuncionalidadController{
    @Autowired
    private FuncionalidadRepository funcionalidadRepository;

    public FuncionalidadController(FuncionalidadRepository funcionalidadRepository){
        this.funcionalidadRepository = funcionalidadRepository;
    }

    @GetMapping("funcionalidad/{id}")
    public Optional<Funcionalidad> getRol(@PathVariable Long IdFuncionalidad) {
        return funcionalidadRepository.findById(IdFuncionalidad);
    }

    @PostMapping("/funcionalidad")
    public Funcionalidad newFuncionalidad(@RequestBody Funcionalidad funcionalidad){
        return funcionalidadRepository.save(funcionalidad);
    }
}
