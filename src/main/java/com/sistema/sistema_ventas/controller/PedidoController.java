package com.sistema.sistema_ventas.controller;

import com.sistema.sistema_ventas.model.Pedido;
import com.sistema.sistema_ventas.repository.PedidoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {

    private final PedidoRepository repo;

    public PedidoController(PedidoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Pedido> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Pedido guardar(@RequestBody Pedido p) {
        return repo.save(p);
    }

    @PutMapping("/{id}")
    public Pedido editar(@PathVariable String id, @RequestBody Pedido p) {
        p.setIdPedido(id);
        return repo.save(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        repo.deleteById(id);
    }
}