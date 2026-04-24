package com.sistema.sistema_ventas.controller;

import com.sistema.sistema_ventas.model.Persona;
import com.sistema.sistema_ventas.repository.PersonaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "*")
public class PersonaController {

    private final PersonaRepository repo;

    public PersonaController(PersonaRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Persona> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Persona guardar(@RequestBody Persona p) {
        return repo.save(p);
    }

    @PutMapping("/{id}")
    public Persona editar(@PathVariable String id, @RequestBody Persona p) {
        p.setIdPersona(id);
        return repo.save(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        repo.deleteById(id);
    }
}