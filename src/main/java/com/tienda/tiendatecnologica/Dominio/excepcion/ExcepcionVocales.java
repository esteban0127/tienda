package com.tienda.tiendatecnologica.Dominio.excepcion;

public class ExcepcionVocales extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ExcepcionVocales(String message) {
        super(message);
    }
}
