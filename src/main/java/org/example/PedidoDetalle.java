package org.example;

public class PedidoDetalle {

    private int cantidad;
    private Panificado panificado;
    private double subtotal;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Panificado getPanificado() {
        return panificado;
    }

    public void setPanificado(Panificado panificado) {
        this.panificado = panificado;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void calcularSubTotal(){
        this.subtotal = this.cantidad * this.panificado.getCantidadHarina();
    }
}
