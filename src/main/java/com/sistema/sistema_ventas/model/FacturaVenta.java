package com.sistema.sistema_ventas.model;

import jakarta.persistence.*;
import java.sql.Date;
import java.math.BigDecimal;

@Entity
@Table(name = "Factura_Venta")
public class FacturaVenta {

    @Id
    @Column(name = "id_factura")
    private String idFactura;

    @Column(name = "Fecha_factura")
    private Date fechaFactura;

    @Column(name = "Estado_factura")
    private String estadoFactura;

    @Column(name = "Total_factura")
    private BigDecimal totalFactura;

    @Column(name = "id_cliente")
    private String idCliente;

    @Column(name = "id_empleado")
    private String idEmpleado;

    @Column(name = "id_pedido")
    private String idPedido;

    @Column(name = "id_metodo")
    private String idMetodo;

    // Getters y Setters
    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(String estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public BigDecimal getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(BigDecimal totalFactura) {
        this.totalFactura = totalFactura;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getIdMetodo() {
        return idMetodo;
    }

    public void setIdMetodo(String idMetodo) {
        this.idMetodo = idMetodo;
    }
}