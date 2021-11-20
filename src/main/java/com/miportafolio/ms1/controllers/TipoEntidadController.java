package com.miportafolio.ms1.controllers;

import com.miportafolio.ms1.models.TipoEntidad;
import com.miportafolio.ms1.repositories.TipoEntidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TipoEntidadController {
    @Autowired
    private TipoEntidadRepository tipoEntidadRepository;

    @PostMapping("/tipoentidad")
    TipoEntidad newTipoEntidad(@RequestBody TipoEntidad tipoEntidad) {
        return tipoEntidadRepository.save(tipoEntidad);
    }

    @DeleteMapping("/tipoentidad/{IdTipoEntidad")
    void deleteTipoEntidad(@PathVariable Long IdTipoEntidad) {
        tipoEntidadRepository.deleteById((IdTipoEntidad));
    }

}
