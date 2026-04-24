package com.sistema.sistema_ventas.repository;

import com.sistema.sistema_ventas.model.ProductoPedido;
import com.sistema.sistema_ventas.model.ProductoPedidoId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoPedidoRepository extends JpaRepository<ProductoPedido, ProductoPedidoId> {

    List<ProductoPedido> findByIdPedido(String idPedido);

}