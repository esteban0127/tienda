package com.tienda.tiendatecnologica.Dominio.modelo.dto;

import java.time.LocalDate;

public class DtoRegistroGarantia {
    private String codigo;
    private String nombre;
    private Double costoGarantia;
    private Double precioProducto;
    private LocalDate fechaInicioGarantia;
    private LocalDate fechaFinGarantia;

    public DtoRegistroGarantia(String codigo, String nombre, Double costoGarantia, Double precioProducto, LocalDate fechaInicioGarantia, LocalDate fechaFinGarantia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costoGarantia = costoGarantia;
        this.precioProducto = precioProducto;
        this.fechaInicioGarantia = fechaInicioGarantia;
        this.fechaFinGarantia = fechaFinGarantia;
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

