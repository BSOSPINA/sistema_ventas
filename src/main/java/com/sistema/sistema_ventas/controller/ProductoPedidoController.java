package com.sistema.sistema_ventas.controller;

import com.sistema.sistema_ventas.model.ProductoPedido;
import com.sistema.sistema_ventas.model.ProductoPedidoId;
import com.sistema.sistema_ventas.repository.ProductoPedidoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto_pedidos")
@CrossOrigin(origins = "*")
public class ProductoPedidoController {

    private final ProductoPedidoRepository repo;

    public ProductoPedidoController(ProductoPedidoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<ProductoPedido> listar() {
        return repo.findAll();
    }

    @PostMapping
    public ProductoPedido guardar(@RequestBody ProductoPedido pp) {
        return repo.save(pp);
    }

    @PutMapping("/{idProd}/{idPedido}")
    public ProductoPedido editar(@PathVariable String idProd,
                                 @PathVariable String idPedido,
                                 @RequestBody ProductoPedido pp) {

        pp.setIdProd(idProd);
        pp.setIdPedido(idPedido);
        return repo.save(pp);
    }

    @DeleteMapping("/{idProd}/{idPedido}")
    public void eliminar(@PathVariable String idProd,
                         @PathVariable String idPedido) {

        ProductoPedidoId id = new ProductoPedidoId(idProd, idPedido);
        repo.deleteById(id);
    }
}