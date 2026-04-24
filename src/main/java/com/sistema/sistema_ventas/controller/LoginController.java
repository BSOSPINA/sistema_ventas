package com.sistema.sistema_ventas.controller;

import com.sistema.sistema_ventas.dto.LoginRequest;
import com.sistema.sistema_ventas.model.Persona;
import com.sistema.sistema_ventas.repository.PersonaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*")
public class LoginController {

    private final PersonaRepository repo;

    public LoginController(PersonaRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public String login(@RequestBody LoginRequest request) {

        Optional<Persona> persona = repo.findByCorreoAndIdPersonaAndIdRol(
                request.getCorreo(),
                request.getClave(),
                "ROL002"
        );

        if (persona.isPresent()) {
            return "OK: " + persona.get().getNombre();
        } else {
            return "ERROR: Usuario o clave incorrectos";
        }
    }
}