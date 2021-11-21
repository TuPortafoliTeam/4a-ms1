package com.miportafolio.ms1.mappers;

import com.miportafolio.ms1.dto.RolDTO;
import com.miportafolio.ms1.models.Rol;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface RolMapper {
    @Mapping(source = "idTipoEntidad", target = "tipoEntidad.idTipoEntidad")
    public Rol RolDTOToRol (RolDTO rolDTO);
    @Mapping(source = "tipoEntidad.idTipoEntidad", target = "idTipoEntidad")
    public RolDTO RolToRolDto (Rol rol);
    public List<Rol> listRolDTOTolistRol (List<RolDTO> rolDTOs);
    public List<RolDTO> listRolTolistRolDto (List<Rol> rol);
}
