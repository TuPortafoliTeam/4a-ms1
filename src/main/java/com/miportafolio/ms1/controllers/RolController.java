package com.miportafolio.ms1.controllers;

import com.miportafolio.ms1.models.Rol;
import com.miportafolio.ms1.repositories.RolRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public class RolController {
    private final RolRepository rolRepository;

    public RolController(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }
    @GetMapping("rol/{id}")
    public Optional<Rol>getRol(@PathVariable String IdRol ){
        return rolRepository.findById(IdRol);
    }
    @PostMapping("/rol")
    Rol newRol (@RequestBody Rol rol){
        return rolRepository.save(rol);
    }

}
