package com.tienda.tiendatecnologica.infraestructura.adaptador.entidad;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="garantia")
public class RegistroGarantiaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    @Column(name = "codigo")
    String codigo;

    @Column(name = "nombre" )
    String nombre;

    @Column (name = "costoGarantia")
    Double costoGarantia;

    @Column (name ="precioProducto")
    Double precioProducto;

    @Column (name = "fechaInicioGarantia")
    LocalDate fechaInicioGarantia;

    @Column (name = "fechaFinGarantia")
    LocalDate fechaFinGarantia;

    public RegistroGarantiaEntity() {
    }

    public RegistroGarantiaEntity(String codigo, String nombre, Double costoGarantia, Double precioProducto, LocalDate fechaInicioGarantia, LocalDate fechaFinGarantia) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.costoGarantia = costoGarantia;
        this.precioProducto = precioProducto;
        this.fechaInicioGarantia = fechaInicioGarantia;
        this.fechaFinGarantia = fechaFinGarantia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
