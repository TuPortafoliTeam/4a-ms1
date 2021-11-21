package com.miportafolio.ms1.mappers;

import com.miportafolio.ms1.dto.RolFuncionalidadDTO;
import com.miportafolio.ms1.models.RolFuncionalidad;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-21T17:26:55-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class RolFuncionalidadMapperImpl implements RolFuncionalidadMapper {

    @Override
    public RolFuncionalidad rolFuncionalidadDTOToRolFuncionalidad(RolFuncionalidadDTO rolFuncionalidadDTO) {
        if ( rolFuncionalidadDTO == null ) {
            return null;
        }

        RolFuncionalidad rolFuncionalidad = new RolFuncionalidad();

        if ( rolFuncionalidadDTO.getIdRolFuncionalidad() != null ) {
            rolFuncionalidad.setIdRolFuncionalidad( Long.parseLong( rolFuncionalidadDTO.getIdRolFuncionalidad() ) );
        }
        if ( rolFuncionalidadDTO.getIdRol() != null ) {
            rolFuncionalidad.setIdRol( Long.parseLong( rolFuncionalidadDTO.getIdRol() ) );
        }
        if ( rolFuncionalidadDTO.getIdFuncionalidad() != null ) {
            rolFuncionalidad.setIdFuncionalidad( Long.parseLong( rolFuncionalidadDTO.getIdFuncionalidad() ) );
        }

        return rolFuncionalidad;
    }

    @Override
    public RolFuncionalidadDTO rolFuncionalidadToRolFuncionalidadDTO(RolFuncionalidad rolFuncionalidad) {
        if ( rolFuncionalidad == null ) {
            return null;
        }

        RolFuncionalidadDTO rolFuncionalidadDTO = new RolFuncionalidadDTO();

        if ( rolFuncionalidad.getIdRolFuncionalidad() != null ) {
            rolFuncionalidadDTO.setIdRolFuncionalidad( String.valueOf( rolFuncionalidad.getIdRolFuncionalidad() ) );
        }
        if ( rolFuncionalidad.getIdRol() != null ) {
            rolFuncionalidadDTO.setIdRol( String.valueOf( rolFuncionalidad.getIdRol() ) );
        }
        if ( rolFuncionalidad.getIdFuncionalidad() != null ) {
            rolFuncionalidadDTO.setIdFuncionalidad( String.valueOf( rolFuncionalidad.getIdFuncionalidad() ) );
        }

        return rolFuncionalidadDTO;
    }

    @Override
    public List<RolFuncionalidad> ListRolFuncionalidadDTOToRolFuncionalidad(List<RolFuncionalidadDTO> rolFuncionalidadDTOs) {
        if ( rolFuncionalidadDTOs == null ) {
            return null;
        }

        List<RolFuncionalidad> list = new ArrayList<RolFuncionalidad>( rolFuncionalidadDTOs.size() );
        for ( RolFuncionalidadDTO rolFuncionalidadDTO : rolFuncionalidadDTOs ) {
            list.add( rolFuncionalidadDTOToRolFuncionalidad( rolFuncionalidadDTO ) );
        }

        return list;
    }

    @Override
    public List<RolFuncionalidadDTO> ListRolFuncionalidadToRolFuncionalidadDTO(List<RolFuncionalidad> rolFuncionalidads) {
        if ( rolFuncionalidads == null ) {
            return null;
        }

        List<RolFuncionalidadDTO> list = new ArrayList<RolFuncionalidadDTO>( rolFuncionalidads.size() );
        for ( RolFuncionalidad rolFuncionalidad : rolFuncionalidads ) {
            list.add( rolFuncionalidadToRolFuncionalidadDTO( rolFuncionalidad ) );
        }

        return list;
    }
}
