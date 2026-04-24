package com.sistema.sistema_ventas.repository;

import com.sistema.sistema_ventas.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<Proveedor, String> {
}