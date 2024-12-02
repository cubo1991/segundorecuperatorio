package org.example;

public class Panificado {

        private String codigo;
        private String denominacion;
        private double cantidadHarina;

    public Panificado(String codigo, String denominacion, double cantidadHarina) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.cantidadHarina = cantidadHarina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getCantidadHarina() {
        return cantidadHarina;
    }

    public void setCantidadHarina(double cantidadHarina) {
        this.cantidadHarina = cantidadHarina;
    }
}
