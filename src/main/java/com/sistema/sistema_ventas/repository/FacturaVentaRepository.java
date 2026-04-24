package com.sistema.sistema_ventas.repository;

import com.sistema.sistema_ventas.model.FacturaVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaVentaRepository extends JpaRepository<FacturaVenta, String> {

    boolean existsByIdPedido(String idPedido);

}