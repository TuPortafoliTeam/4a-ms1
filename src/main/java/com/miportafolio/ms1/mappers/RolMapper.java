package com.miportafolio.ms1.mappers;

import com.miportafolio.ms1.dto.RolDTO;
import com.miportafolio.ms1.models.Rol;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface RolMapper {
    @Mapping(source = "tipoEntidad.idTipoEntidad", target = "tipoEntidad")
    public RolDTO rolToRolDto (Rol Rol);

    @Mapping(source = "tipoEntidad", target = "tipoEntidad.idTipoEntidad")
    public Rol rolDTOToRol (RolDTO RolDTO);

    public List<RolDTO> listRolToListRolDTO (List<Rol> Roles);

    public List<Rol> listRolDTOToListRol (List<RolDTO> RolDTOs);
}
