package com.miportafolio.ms1.mappers;

import com.miportafolio.ms1.dto.RolFuncionalidadDTO;
import com.miportafolio.ms1.models.RolFuncionalidad;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface RolFuncionalidadMapper {
     public RolFuncionalidad rolFuncionalidadDTOToRolFuncionalidad(RolFuncionalidadDTO rolFuncionalidadDTO);

     public RolFuncionalidadDTO rolFuncionalidadToRolFuncionalidadDTO(RolFuncionalidad rolFuncionalidad);

     public List<RolFuncionalidad> ListRolFuncionalidadDTOToRolFuncionalidad(
               List<RolFuncionalidadDTO> rolFuncionalidadDTOs);

     public List<RolFuncionalidadDTO> ListRolFuncionalidadToRolFuncionalidadDTO(
               List<RolFuncionalidad> rolFuncionalidads);
}
