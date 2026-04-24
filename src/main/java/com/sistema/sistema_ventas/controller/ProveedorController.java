package com.sistema.sistema_ventas.controller;

import com.sistema.sistema_ventas.model.Proveedor;
import com.sistema.sistema_ventas.repository.ProveedorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
@CrossOrigin(origins = "*")
public class ProveedorController {

    private final ProveedorRepository repo;

    public ProveedorController(ProveedorRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Proveedor> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Proveedor guardar(@RequestBody Proveedor p) {
        return repo.save(p);
    }

    @PutMapping("/{id}")
    public Proveedor editar(@PathVariable String id, @RequestBody Proveedor p) {
        p.setIdProv(id);
        return repo.save(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        repo.deleteById(id);
    }
}