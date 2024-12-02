package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CrearOrdenProduccion {
    public static void main(String[] args) {

        ArrayList<Panificado> productosDisponibles = new ArrayList<Panificado>();
        Scanner sc = new Scanner(System.in);

        Panificado prod = new Panificado ("100", "Kilo de Pan", 0.5);
        productosDisponibles.add(prod);
        prod = new Panificado ("200", "Docena de Facturas Especiales", 1);
        productosDisponibles.add(prod);
        prod = new Panificado ("300", "Docena de Facturas Comunes", 0.8);
        productosDisponibles.add(prod);
        prod = new Panificado ("400", "Docena de Tortitas Raspadas", 0.7);
        productosDisponibles.add(prod);
        prod = new Panificado ("500", "Docena de Tortitas de Hoja", 0.6);
        productosDisponibles.add(prod);

        OrdenProduccion ordenProduccion = new OrdenProduccion();

        System.out.println("Por favor, ingrese la fecha del pedido");
        ordenProduccion.setFecha(sc.nextLine());

        ArrayList<Pedido> pedidos = new ArrayList<>();

        //Comenzamos la carga los pedidos

        while(true){
            Pedido pedido = new Pedido();

            System.out.println("Ingrese el nombre del cliente");
            pedido.setNombreCliente(sc.nextLine());
            System.out.println("Ingrese el numero del pedido");
            pedido.setNumeroPedido(Long.parseLong(sc.nextLine()));
                //Comenzamos el pedido del detalle
                ArrayList<PedidoDetalle> detalles = new ArrayList<>();
                while(true){

                    PedidoDetalle pedidoDetalle = new PedidoDetalle();
                    System.out.println("Ingrese la cantidad");
                    pedidoDetalle.setCantidad(Integer.parseInt(sc.nextLine()));
                    System.out.println("Ingrese el codigo del producto disponible que desea");

                    boolean codigoEncontrado = false;
                    do{
                        String codigoProducto = sc.nextLine();
                        for(Panificado p : productosDisponibles){
                            if(p.getCodigo().equals(codigoProducto)){
                                codigoEncontrado = true;
                                pedidoDetalle.setPanificado(p);
                                break;
                            }





                        }
                        if(!codigoEncontrado) {
                            System.out.println("El código es incorrecto, ingrese nuevamente");
                        }
                    }while(!codigoEncontrado);
                    detalles.add(pedidoDetalle);

                    System.out.println("Desea cargar mas detalles? S/N");
                    String opcion = sc.nextLine();
                    if(opcion.equalsIgnoreCase("N")){
                        break;
                    }








                }
                    pedidos.add(pedido);
                    System.out.println(pedidos.size());

                pedido.setDetallesPedido(detalles);

                pedido.calcularVenta();
             System.out.println("Desea cargar más pedidos?");
            String opcion2 = sc.nextLine();
              if(opcion2.equalsIgnoreCase("N")){
                break;
            }



                //Terminamos el pedido del detalle




//Finaliza la carga de los pedidos

        }

        ordenProduccion.setPedidos(pedidos);
        ordenProduccion.mostrarOrden();
        ordenProduccion.totalRepartoCalculado();







    //Aca termina el main
    }

}
