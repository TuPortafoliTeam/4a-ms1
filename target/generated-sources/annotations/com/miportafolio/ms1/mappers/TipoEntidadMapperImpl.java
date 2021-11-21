package com.miportafolio.ms1.mappers;

import com.miportafolio.ms1.dto.TipoEntidadDTO;
import com.miportafolio.ms1.models.TipoEntidad;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-21T08:18:04-0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class TipoEntidadMapperImpl implements TipoEntidadMapper {

    @Override
    public TipoEntidad tipoEntidadDTOToTipoEntidad(TipoEntidadDTO tipoEntidadDTO) {
        if ( tipoEntidadDTO == null ) {
            return null;
        }

        TipoEntidad tipoEntidad = new TipoEntidad();

        if ( tipoEntidadDTO.getIdTipoEntidad() != null ) {
            tipoEntidad.setIdTipoEntidad( tipoEntidadDTO.getIdTipoEntidad() );
        }
        tipoEntidad.setNombre( tipoEntidadDTO.getNombre() );

        return tipoEntidad;
    }

    @Override
    public TipoEntidadDTO tipoEntidadToTipoEntidadDTO(TipoEntidad tipoEntidad) {
        if ( tipoEntidad == null ) {
            return null;
        }

        TipoEntidadDTO tipoEntidadDTO = new TipoEntidadDTO();

        tipoEntidadDTO.setIdTipoEntidad( tipoEntidad.getIdTipoEntidad() );
        tipoEntidadDTO.setNombre( tipoEntidad.getNombre() );

        return tipoEntidadDTO;
    }

    @Override
    public List<TipoEntidad> listTipoEntidadDTOTolistTipoEntidad(List<TipoEntidadDTO> tipoEntidadDTOs) {
        if ( tipoEntidadDTOs == null ) {
            return null;
        }

        List<TipoEntidad> list = new ArrayList<TipoEntidad>( tipoEntidadDTOs.size() );
        for ( TipoEntidadDTO tipoEntidadDTO : tipoEntidadDTOs ) {
            list.add( tipoEntidadDTOToTipoEntidad( tipoEntidadDTO ) );
        }

        return list;
    }

    @Override
    public List<TipoEntidadDTO> listTipoEntidadTolistTipoEntidadDTO(List<TipoEntidad> TipoEntidads) {
        if ( TipoEntidads == null ) {
            return null;
        }

        List<TipoEntidadDTO> list = new ArrayList<TipoEntidadDTO>( TipoEntidads.size() );
        for ( TipoEntidad tipoEntidad : TipoEntidads ) {
            list.add( tipoEntidadToTipoEntidadDTO( tipoEntidad ) );
        }

        return list;
    }
}
