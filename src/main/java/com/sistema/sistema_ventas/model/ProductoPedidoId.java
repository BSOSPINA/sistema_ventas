package com.sistema.sistema_ventas.model;

import java.io.Serializable;
import java.util.Objects;

public class ProductoPedidoId implements Serializable {

    private String idProd;
    private String idPedido;

    public ProductoPedidoId() {
    }

    public ProductoPedidoId(String idProd, String idPedido) {
        this.idProd = idProd;
        this.idPedido = idPedido;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoPedidoId that = (ProductoPedidoId) o;
        return Objects.equals(idProd, that.idProd) &&
               Objects.equals(idPedido, that.idPedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProd, idPedido);
    }
}