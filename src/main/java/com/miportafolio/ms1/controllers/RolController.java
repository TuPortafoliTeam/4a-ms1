package com.miportafolio.ms1.controllers;

import com.miportafolio.ms1.dto.ResponseDTO;
import com.miportafolio.ms1.dto.RolDTO;
import com.miportafolio.ms1.mappers.RolMapper;
import com.miportafolio.ms1.repositories.RolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rol")
public class RolController {
    @Autowired
    private RolRepository rolRepository;
    @Autowired
    private RolMapper rolMapper;

    @GetMapping("{id}")
    public ResponseEntity<?> getRol(@PathVariable Long IdRol) {
        return ResponseEntity.ok()
                .body(new ResponseDTO(true, null, rolMapper.rolToRolDto(rolRepository.findById(IdRol).get())));
    }

    @PostMapping()
    public ResponseEntity<?> newRol(@RequestBody RolDTO rol) {
        return ResponseEntity.ok().body(
                new ResponseDTO(true, null, rolMapper.rolToRolDto(rolRepository.save(rolMapper.rolDTOToRol(rol)))));
    }

}
