package com.miportafolio.ms1.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import com.miportafolio.ms1.dto.RolDTO;
import com.miportafolio.ms1.models.Rol;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface RolMapper {
    @Mapping(source = "tipoEntidad.idTipoEntidad", target = "idTipoEntidad")
    public RolDTO rolToRolDto(Rol Rol);

    @Mapping(source = "idTipoEntidad", target = "tipoEntidad.idTipoEntidad")
    public Rol rolDTOToRol(RolDTO RolDTO);

    public List<RolDTO> listRolToListRolDTO(List<Rol> Roles);

    public List<Rol> listRolDTOToListRol(List<RolDTO> RolDTOs);
}
