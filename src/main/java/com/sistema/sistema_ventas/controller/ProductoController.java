package com.sistema.sistema_ventas.controller;

import com.sistema.sistema_ventas.model.Producto;
import com.sistema.sistema_ventas.repository.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*")
public class ProductoController {

    private final ProductoRepository repo;

    public ProductoController(ProductoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Producto> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto p) {
        return repo.save(p);
    }

    @PutMapping("/{id}")
    public Producto editar(@PathVariable String id, @RequestBody Producto p) {
        p.setIdProd(id);
        return repo.save(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        repo.deleteById(id);
    }
}