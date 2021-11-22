package com.miportafolio.ms1.controllers;

import com.miportafolio.ms1.models.Funcionalidad;
import com.miportafolio.ms1.repositories.FuncionalidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("funcionalidad")
public class FuncionalidadController {
    @Autowired
    private FuncionalidadRepository funcionalidadRepository;

    @GetMapping("{id}")
    public Optional<Funcionalidad> getFuncionalidad(@PathVariable Long IdFuncionalidad) {
        return funcionalidadRepository.findById(IdFuncionalidad);
    }

    @PostMapping()
    public Funcionalidad newFuncionalidad(@RequestBody Funcionalidad funcionalidad) {
        return funcionalidadRepository.save(funcionalidad);
    }
}
