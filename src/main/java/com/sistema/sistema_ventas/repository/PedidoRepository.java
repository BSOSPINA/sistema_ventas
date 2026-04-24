package com.sistema.sistema_ventas.repository;

import com.sistema.sistema_ventas.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, String> {
}