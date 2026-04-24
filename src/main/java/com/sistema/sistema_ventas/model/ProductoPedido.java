package com.sistema.sistema_ventas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Producto_Pedidos")
@IdClass(ProductoPedidoId.class)
public class ProductoPedido {

    @Id
    @Column(name = "id_prod")
    private String idProd;

    @Id
    @Column(name = "id_pedido")
    private String idPedido;

    @Column(name = "Cantidad")
    private int cantidad;

    @Column(name = "Precio_Unitario")
    private int precioUnitario;

    // Getters y Setters
    public String getIdProd() {
        return idProd;
    }

    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}