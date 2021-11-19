package com.miportafolio.ms1.controllers;

import com.miportafolio.ms1.exceptions.UsuarioRolNotFoundException;
import com.miportafolio.ms1.models.UsuarioRol;
import com.miportafolio.ms1.repositories.UsuarioRolRepository;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioRolController {

    private final UsuarioRolRepository usuarioRolRepository;

    public UsuarioRolController(UsuarioRolRepository usuarioRolRepository) {
        this.usuarioRolRepository = usuarioRolRepository;
    }

    @GetMapping ("/usuariorol/{IdUsuarioRol}")
    public UsuarioRol getUsuarioRolbyId (@PathVariable Integer IdUserRol){
        return usuarioRolRepository.findById(IdUserRol)
                .orElseThrow(()-> new UsuarioRolNotFoundException("No existe esta relación"));
    }

    @GetMapping("/usuariorol")
    public List<UsuarioRol> getUsuarioRolAll (){
        return usuarioRolRepository.findAll();
    }

    @PostMapping("/usuariorol")
    public UsuarioRol newUsuarioRol (@RequestBody UsuarioRol usuarioRol){
        return usuarioRolRepository.save(usuarioRol);
    }

    @DeleteMapping ("/usuariorol/{IdUsuarioRol}")
    public void deleteUsuarioRolbyId (@PathVariable Integer IdUserRol) {
        usuarioRolRepository.deleteById(IdUserRol);
    }
}
