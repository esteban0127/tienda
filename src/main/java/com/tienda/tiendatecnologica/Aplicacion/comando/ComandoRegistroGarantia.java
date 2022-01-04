package com.tienda.tiendatecnologica.Aplicacion.comando;

import java.time.LocalDate;

public class ComandoRegistroGarantia {

    private String codigo;
    private String nombre;
    private double precioProducto;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }


}
