package com.miportafolio.ms1.mappers;

import com.miportafolio.ms1.dto.TipoEntidadDTO;
import com.miportafolio.ms1.models.TipoEntidad;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface TipoEntidadMapper {
    public TipoEntidad tipoEntidadDTOToTipoEntidad (TipoEntidadDTO tipoEntidadDTO);
    public TipoEntidadDTO tipoEntidadToTipoEntidadDTO(TipoEntidad tipoEntidad);
    public List<TipoEntidad> listTipoEntidadDTOToListTipoEntidad (List<TipoEntidadDTO> tipoEntidadDTOs);
    public List<TipoEntidadDTO> listTipoEntidadToListTipoEntidadDTO(List<TipoEntidad> TipoEntidads);
}


