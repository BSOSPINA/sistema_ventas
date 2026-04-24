package com.sistema.sistema_ventas.service;

import com.sistema.sistema_ventas.model.FacturaVenta;
import com.sistema.sistema_ventas.model.Pedido;
import com.sistema.sistema_ventas.model.ProductoPedido;
import com.sistema.sistema_ventas.repository.FacturaVentaRepository;
import com.sistema.sistema_ventas.repository.PedidoRepository;
import com.sistema.sistema_ventas.repository.ProductoPedidoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class FacturaService {

    private final FacturaVentaRepository facturaRepo;
    private final PedidoRepository pedidoRepo;
    private final ProductoPedidoRepository detalleRepo;

    public FacturaService(FacturaVentaRepository facturaRepo,
                          PedidoRepository pedidoRepo,
                          ProductoPedidoRepository detalleRepo) {
        this.facturaRepo = facturaRepo;
        this.pedidoRepo = pedidoRepo;
        this.detalleRepo = detalleRepo;
    }

    public FacturaVenta generarFactura(String idFactura, String idPedido, String idMetodo, String idEmpleado) {

        Pedido pedido = pedidoRepo.findById(idPedido).orElse(null);
        
        if (facturaRepo.existsByIdPedido(idPedido)) {
            throw new RuntimeException("Ya existe una factura para este pedido");
        }

        if (pedido == null) {
            throw new RuntimeException("Pedido no existe");
        }

        List<ProductoPedido> detalles = detalleRepo.findByIdPedido(idPedido);

        if (detalles.isEmpty()) {
            throw new RuntimeException("El pedido no tiene productos registrados");
        }

        int total = 0;

        for (ProductoPedido d : detalles) {
            total += d.getCantidad() * d.getPrecioUnitario();
        }

        FacturaVenta factura = new FacturaVenta();
        factura.setIdFactura(idFactura);
        factura.setFechaFactura(Date.valueOf(LocalDate.now()));
        factura.setEstadoFactura("pendiente");
        factura.setTotalFactura(BigDecimal.valueOf(total));

        factura.setIdCliente(pedido.getIdPersona());
        factura.setIdEmpleado(idEmpleado);
        factura.setIdPedido(idPedido);
        factura.setIdMetodo(idMetodo);

        return facturaRepo.save(factura);
    }
}