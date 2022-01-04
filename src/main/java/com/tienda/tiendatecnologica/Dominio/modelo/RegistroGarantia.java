package com.tienda.tiendatecnologica.Dominio.modelo;

import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRespuestaCreacionGarantia;

import java.time.LocalDate;

public class RegistroGarantia {

    private String codigo;
    private String nombre;
    private Double costoGarantia;
    private Double precioProducto;
    private LocalDate fechaInicioGarantia;
    private LocalDate fechaFinGarantia;

    public RegistroGarantia(String codigo, String nombre , Double precioProducto) {
        this.codigo = codigo;
        this.nombre= nombre;
        this.precioProducto = precioProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCostoGarantia() {
        return costoGarantia;
    }

    public void setCostoGarantia(Double costoGarantia) {
        this.costoGarantia = costoGarantia;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public LocalDate getFechaInicioGarantia() {
        return fechaInicioGarantia;
    }

    public void setFechaInicioGarantia(LocalDate fechaInicioGarantia) {
        this.fechaInicioGarantia = fechaInicioGarantia;
    }

    public LocalDate getFechaFinGarantia() {
        return fechaFinGarantia;
    }

    public void setFechaFinGarantia(LocalDate fechaFinGarantia) {
        this.fechaFinGarantia = fechaFinGarantia;
    }
}
