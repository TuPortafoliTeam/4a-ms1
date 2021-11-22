package com.miportafolio.ms1.controllers;

import com.miportafolio.ms1.exceptions.UsuarioRolNotFoundException;
import com.miportafolio.ms1.models.UsuarioRol;
import com.miportafolio.ms1.repositories.UsuarioRolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioRolController {
    @Autowired
    private UsuarioRolRepository usuarioRolRepository;

    @GetMapping("/usuariorol/{IdUsuarioRol}")
    public UsuarioRol getUsuarioRolbyId(@PathVariable Long IdUserRol) {
        return usuarioRolRepository.findById(IdUserRol)
                .orElseThrow(() -> new UsuarioRolNotFoundException("No existe esta relación"));
    }

    @GetMapping("/usuariorol")
    public List<UsuarioRol> getUsuarioRolAll() {
        return usuarioRolRepository.findAll();
    }

    @PostMapping("/usuariorol")
    public UsuarioRol newUsuarioRol(@RequestBody UsuarioRol usuarioRol) {
        return usuarioRolRepository.save(usuarioRol);
    }

    @DeleteMapping("/usuariorol/{IdUsuarioRol}")
    public void deleteUsuarioRolbyId(@PathVariable Long IdUserRol) {
        usuarioRolRepository.deleteById(IdUserRol);
    }
}
