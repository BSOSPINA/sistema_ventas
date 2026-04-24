package com.sistema.sistema_ventas.repository;

import com.sistema.sistema_ventas.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PersonaRepository extends JpaRepository<Persona, String> {

    Optional<Persona> findByCorreoAndIdPersonaAndIdRol(String correo, String idPersona, String idRol);
}