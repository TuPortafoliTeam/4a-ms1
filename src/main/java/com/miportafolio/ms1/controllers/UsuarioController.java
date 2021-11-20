package com.miportafolio.ms1.controllers;

import com.miportafolio.ms1.dto.ResponseDTO;
import com.miportafolio.ms1.dto.UsuarioDTO;
import com.miportafolio.ms1.mappers.UsuarioMapper;
import com.miportafolio.ms1.models.Usuario;
import com.miportafolio.ms1.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioMapper usuarioMapper;

    @PostMapping("registro")
    public ResponseEntity<?> saveUser(@RequestBody UsuarioDTO user) {
        user.setContrasena(bCryptPasswordEncoder.encode(user.getContrasena()));
        usuarioRepository.save(usuarioMapper.usuarioDTOToUsuario(user));
        return ResponseEntity.ok().body(new ResponseDTO(true, null));
    }

    @PutMapping("actualizar")
    public ResponseEntity<?> putMethodName(@RequestBody UsuarioDTO user) {
        Usuario db = usuarioRepository.findById(user.getIdUsuario()).get();
        if (user.getContrasena() == null)
            user.setContrasena(db.getContrasena());
        else
            user.setContrasena(bCryptPasswordEncoder.encode(user.getContrasena()));
        db = usuarioRepository.save(usuarioMapper.usuarioDTOToUsuario(user));
        db.setContrasena(null);
        return ResponseEntity.ok().body(new ResponseDTO(true, null, usuarioMapper.usuarioToUsuarioDTO(db)));
    }
}
