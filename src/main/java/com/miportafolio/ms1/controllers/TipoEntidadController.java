package com.miportafolio.ms1.controllers;

import com.miportafolio.ms1.models.TipoEntidad;
import com.miportafolio.ms1.repositories.TipoEntidadRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class TipoEntidadController {
    private final TipoEntidadRepository tipoEntidadRepository;
    public TipoEntidadController(TipoEntidadRepository tipoEntidadRepository){
        this.tipoEntidadRepository = tipoEntidadRepository;
    }
    @PostMapping("/tipoentidad")
    TipoEntidad newTipoEntidad(@RequestBody TipoEntidad tipoEntidad){
        return  tipoEntidadRepository.save(tipoEntidad);
    }
    @DeleteMapping("/tipoentidad/{IdTipoEntidad")
    void deleteTipoEntidad (@PathVariable String IdTipoEntidad){
        tipoEntidadRepository.deleteById((IdTipoEntidad));
    }

}
