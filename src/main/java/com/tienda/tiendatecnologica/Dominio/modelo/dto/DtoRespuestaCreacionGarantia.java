package com.tienda.tiendatecnologica.Dominio.modelo.dto;

import java.time.LocalDate;

public class DtoRespuestaCreacionGarantia {
    private String codigo;
    private LocalDate fechaFinGarantia;

    public DtoRespuestaCreacionGarantia(String codigo, LocalDate fechaFinGarantia) {
        this.codigo = codigo;
        this.fechaFinGarantia = fechaFinGarantia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaFinGarantia() {
        return fechaFinGarantia;
    }

    public void setFechaFinGarantia(LocalDate fechaFinGarantia) {
        this.fechaFinGarantia = fechaFinGarantia;
    }
}
