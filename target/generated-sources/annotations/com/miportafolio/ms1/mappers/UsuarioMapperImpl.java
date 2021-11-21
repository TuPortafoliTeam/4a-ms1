package com.miportafolio.ms1.mappers;

import com.miportafolio.ms1.dto.UsuarioDTO;
import com.miportafolio.ms1.models.TipoEntidad;
import com.miportafolio.ms1.models.Usuario;
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
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioDTO usuarioToUsuarioDTO(Usuario Usuario) {
        if ( Usuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setIdTipoEntidad( usuarioTipoEntidadIdTipoEntidad( Usuario ) );
        usuarioDTO.setIdUsuario( Usuario.getIdUsuario() );
        usuarioDTO.setTipoDocIdentidad( Usuario.getTipoDocIdentidad() );
        usuarioDTO.setNumeroDocumento( Usuario.getNumeroDocumento() );
        usuarioDTO.setNombre( Usuario.getNombre() );
        usuarioDTO.setCorreo( Usuario.getCorreo() );
        usuarioDTO.setTelefono( Usuario.getTelefono() );
        usuarioDTO.setContrasena( Usuario.getContrasena() );

        return usuarioDTO;
    }

    @Override
    public Usuario usuarioDTOToUsuario(UsuarioDTO UsuarioDTO) {
        if ( UsuarioDTO == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setTipoEntidad( usuarioDTOToTipoEntidad( UsuarioDTO ) );
        usuario.setIdUsuario( UsuarioDTO.getIdUsuario() );
        usuario.setTipoDocIdentidad( UsuarioDTO.getTipoDocIdentidad() );
        usuario.setNumeroDocumento( UsuarioDTO.getNumeroDocumento() );
        usuario.setNombre( UsuarioDTO.getNombre() );
        usuario.setCorreo( UsuarioDTO.getCorreo() );
        usuario.setTelefono( UsuarioDTO.getTelefono() );
        usuario.setContrasena( UsuarioDTO.getContrasena() );

        return usuario;
    }

    @Override
    public List<UsuarioDTO> listUsuarioToListUsuarioDTO(List<Usuario> Usuarios) {
        if ( Usuarios == null ) {
            return null;
        }

        List<UsuarioDTO> list = new ArrayList<UsuarioDTO>( Usuarios.size() );
        for ( Usuario usuario : Usuarios ) {
            list.add( usuarioToUsuarioDTO( usuario ) );
        }

        return list;
    }

    @Override
    public List<Usuario> listUsuarioDTOToListUsuario(List<UsuarioDTO> UsuarioDTOs) {
        if ( UsuarioDTOs == null ) {
            return null;
        }

        List<Usuario> list = new ArrayList<Usuario>( UsuarioDTOs.size() );
        for ( UsuarioDTO usuarioDTO : UsuarioDTOs ) {
            list.add( usuarioDTOToUsuario( usuarioDTO ) );
        }

        return list;
    }

    private Long usuarioTipoEntidadIdTipoEntidad(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }
        TipoEntidad tipoEntidad = usuario.getTipoEntidad();
        if ( tipoEntidad == null ) {
            return null;
        }
        Long idTipoEntidad = tipoEntidad.getIdTipoEntidad();
        if ( idTipoEntidad == null ) {
            return null;
        }
        return idTipoEntidad;
    }

    protected TipoEntidad usuarioDTOToTipoEntidad(UsuarioDTO usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        TipoEntidad tipoEntidad = new TipoEntidad();

        if ( usuarioDTO.getIdTipoEntidad() != null ) {
            tipoEntidad.setIdTipoEntidad( usuarioDTO.getIdTipoEntidad() );
        }

        return tipoEntidad;
    }
}
