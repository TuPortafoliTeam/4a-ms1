package com.miportafolio.ms1.mappers;

import com.miportafolio.ms1.dto.RolDTO;
import com.miportafolio.ms1.models.Rol;
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
public class RolMapperImpl implements RolMapper {

    @Override
    public RolDTO rolToRolDto(Rol Rol) {
        if ( Rol == null ) {
            return null;
        }

        RolDTO rolDTO = new RolDTO();

        rolDTO.setTipoEntidad( rolTipoEntidadIdTipoEntidad( Rol ) );
        rolDTO.setIdRol( Rol.getIdRol() );
        rolDTO.setNombre( Rol.getNombre() );

        return rolDTO;
    }

    @Override
    public Rol rolDTOToRol(RolDTO RolDTO) {
        if ( RolDTO == null ) {
            return null;
        }

        Rol rol = new Rol();

        rol.setTipoEntidad( rolDTOToTipoEntidad( RolDTO ) );
        rol.setIdRol( RolDTO.getIdRol() );
        rol.setNombre( RolDTO.getNombre() );

        return rol;
    }

    @Override
    public List<RolDTO> listRolToListRolDTO(List<Rol> Roles) {
        if ( Roles == null ) {
            return null;
        }

        List<RolDTO> list = new ArrayList<RolDTO>( Roles.size() );
        for ( Rol rol : Roles ) {
            list.add( rolToRolDto( rol ) );
        }

        return list;
    }

    @Override
    public List<Rol> listRolDTOToListRol(List<RolDTO> RolDTOs) {
        if ( RolDTOs == null ) {
            return null;
        }

        List<Rol> list = new ArrayList<Rol>( RolDTOs.size() );
        for ( RolDTO rolDTO : RolDTOs ) {
            list.add( rolDTOToRol( rolDTO ) );
        }

        return list;
    }

    private Long rolTipoEntidadIdTipoEntidad(Rol rol) {
        if ( rol == null ) {
            return null;
        }
        TipoEntidad tipoEntidad = rol.getTipoEntidad();
        if ( tipoEntidad == null ) {
            return null;
        }
        Long idTipoEntidad = tipoEntidad.getIdTipoEntidad();
        if ( idTipoEntidad == null ) {
            return null;
        }
        return idTipoEntidad;
    }

    protected TipoEntidad rolDTOToTipoEntidad(RolDTO rolDTO) {
        if ( rolDTO == null ) {
            return null;
        }

        TipoEntidad tipoEntidad = new TipoEntidad();

        if ( rolDTO.getTipoEntidad() != null ) {
            tipoEntidad.setIdTipoEntidad( rolDTO.getTipoEntidad() );
        }

        return tipoEntidad;
    }
}
