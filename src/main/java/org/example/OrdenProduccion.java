package org.example;

import java.util.ArrayList;

public class OrdenProduccion {

    private String fecha;
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private double totalReparto;

    public double getTotalReparto() {
        return totalReparto;
    }

    public void setTotalReparto(double totalReparto) {
        this.totalReparto = totalReparto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void mostrarOrden (){
        System.out.println("Orden de Producción");
        System.out.println("Fecha Orden: "+ this.fecha);
        System.out.println("--------------Pedidos de Clientes----------------");
        System.out.println(this.pedidos.size());
        for (Pedido pedido : this.pedidos) {
            System.out.println("Nombre de cliente " + pedido.getNombreCliente());
            System.out.println("Numero Pedido: " + pedido.getNumeroPedido());
            System.out.printf("%-30s %-20s %-20s %-20s \n", "Cantidad Pedida", "Panificado","Cantidad Harina", "Sutotal");

            for(PedidoDetalle detalle : pedido.getDetallesPedido()){
                detalle.calcularSubTotal();
                String subTotal = String.valueOf(detalle.getSubtotal());
                System.out.printf("%-30s %-20s %-20s %-20s \n", detalle.getCantidad(), detalle.getPanificado().getDenominacion(), detalle.getPanificado().getCantidadHarina(), subTotal);
                System.out.println("Total Harina Pedido: "+ pedido.getTotalVenta());

            }



        }

    }

    public void totalRepartoCalculado(){
        double total = 0;
        for(Pedido pedido : pedidos){
            total += pedido.getTotalVenta();
        }

        System.out.println("Total Harina Orden Producción: " + total   );
    }

}
