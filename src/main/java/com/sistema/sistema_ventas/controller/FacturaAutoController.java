package com.sistema.sistema_ventas.controller;

import com.sistema.sistema_ventas.model.FacturaVenta;
import com.sistema.sistema_ventas.service.FacturaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/factura_auto")
@CrossOrigin(origins = "*")
public class FacturaAutoController {

    private final FacturaService facturaService;

    public FacturaAutoController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @PostMapping
    public FacturaVenta generarFactura(@RequestParam String idFactura,
                                       @RequestParam String idPedido,
                                       @RequestParam String idMetodo,
                                       @RequestParam String idEmpleado) {

        return facturaService.generarFactura(idFactura, idPedido, idMetodo, idEmpleado);
    }
}