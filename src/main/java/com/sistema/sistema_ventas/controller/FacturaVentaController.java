package com.sistema.sistema_ventas.controller;

import com.sistema.sistema_ventas.model.FacturaVenta;
import com.sistema.sistema_ventas.repository.FacturaVentaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
@CrossOrigin(origins = "*")
public class FacturaVentaController {

    private final FacturaVentaRepository repo;

    public FacturaVentaController(FacturaVentaRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<FacturaVenta> listar() {
        return repo.findAll();
    }

    @PostMapping
    public FacturaVenta guardar(@RequestBody FacturaVenta f) {
        return repo.save(f);
    }

    @PutMapping("/{id}")
    public FacturaVenta editar(@PathVariable String id, @RequestBody FacturaVenta f) {
        f.setIdFactura(id);
        return repo.save(f);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        repo.deleteById(id);
    }
}