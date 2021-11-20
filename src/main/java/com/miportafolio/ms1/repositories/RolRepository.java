package com.miportafolio.ms1.repositories;

import com.miportafolio.ms1.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolRepository extends JpaRepository<Rol,String> {
    List<Rol> findByIdRol(String IdRol);
}
