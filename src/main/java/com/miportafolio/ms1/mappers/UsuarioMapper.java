package com.miportafolio.ms1.mappers;

import java.util.List;

import com.miportafolio.ms1.dto.UsuarioDTO;
import com.miportafolio.ms1.models.Usuario;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface UsuarioMapper {
    @Mapping(source = "tipoEntidad.idTipoEntidad", target = "idTipoEntidad")
    public UsuarioDTO usuarioToUsuarioDTO(Usuario Usuario);

    @Mapping(source = "idTipoEntidad", target = "tipoEntidad.idTipoEntidad")
    public Usuario usuarioDTOToUsuario(UsuarioDTO UsuarioDTO);

    public List<UsuarioDTO> listUsuarioToListUsuarioDTO(List<Usuario> Usuarios);

    public List<Usuario> listUsuarioDTOToListUsuario(List<UsuarioDTO> UsuarioDTOs);
}

