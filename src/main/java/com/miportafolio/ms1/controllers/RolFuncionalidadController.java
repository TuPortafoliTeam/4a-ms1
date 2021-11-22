package com.miportafolio.ms1.controllers;

import com.miportafolio.ms1.models.RolFuncionalidad;
import com.miportafolio.ms1.repositories.RolFuncionalidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("rolFuncionalidad")
public class RolFuncionalidadController {
    @Autowired
    private RolFuncionalidadRepository rolFuncionalidadRepository;

    @GetMapping("{id}")
    public Optional<RolFuncionalidad> getRol(@PathVariable Long IdRolFuncionalidad) {
        return rolFuncionalidadRepository.findById(IdRolFuncionalidad);
    }

    @PostMapping()
    RolFuncionalidad newRol(@RequestBody RolFuncionalidad rolFuncionalidad) {
        return rolFuncionalidadRepository.save(rolFuncionalidad);
    }
}
