package com.sistema.sistema_ventas.repository;

import com.sistema.sistema_ventas.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, String> {
}