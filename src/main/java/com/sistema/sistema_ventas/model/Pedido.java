package com.sistema.sistema_ventas.model;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @Column(name = "id_pedido")
    private String idPedido;

    @Column(name = "Fecha_pedido")
    private Date fechaPedido;

    @Column(name = "Numero_pedido")
    private String numeroPedido;

    @Column(name = "Estado_pedido")
    private String estadoPedido;

    @Column(name = "id_persona")
    private String idPersona;

    // Getters y Setters
    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }
}