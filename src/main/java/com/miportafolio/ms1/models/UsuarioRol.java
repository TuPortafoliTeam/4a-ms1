package com.miportafolio.ms1.models;

import org.springframework.data.annotation.Id;
import com.miportafolio.ms1.models.Rol;
import com.miportafolio.ms1.models.Usuario;
import javax.persistence.*;

@Entity
@Table (name = "UsuarioRol")
public class UsuarioRol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdUsuarioRol;
    @ManyToOne
    @JoinColumn(name = "IdUsuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "IdRol")
    private Rol rol;

    public UsuarioRol(Usuario usuario, Rol rol) {
        this.usuario = usuario;
        this.rol = rol;
    }

    public UsuarioRol() {
        super();
    }

    public Integer getIdUsuarioRol() {
        return IdUsuarioRol;
    }

    public void setIdUsuarioRol(Integer idUsuarioRol) {
        IdUsuarioRol = idUsuarioRol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
