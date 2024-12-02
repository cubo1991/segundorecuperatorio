package org.example;

import java.util.ArrayList;

public class Pedido {

    private String nombreCliente;
    private long numeroPedido;
    private ArrayList<PedidoDetalle> detallesPedido = new ArrayList<PedidoDetalle>();
    private double totalVenta =0 ;

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public ArrayList<PedidoDetalle> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(ArrayList<PedidoDetalle> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }

    public void calcularVenta() {
        for (PedidoDetalle detalle : detallesPedido) {
            this.totalVenta += detalle.getSubtotal();
        }

    }
}
