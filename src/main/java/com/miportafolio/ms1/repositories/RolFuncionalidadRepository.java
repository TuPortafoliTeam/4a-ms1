package com.miportafolio.ms1.repositories;

import com.miportafolio.ms1.models.RolFuncionalidad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolFuncionalidadRepository extends JpaRepository<RolFuncionalidad, Long>{
    List<RolFuncionalidad> findByIdRol(Long idRolFuncionalidad);
}
