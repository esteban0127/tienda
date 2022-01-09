package com.tienda.tiendatecnologica.Dominio.excepcion;

public class ExcepcionGarantia extends RuntimeException{
    private static final long serialVersionUID = 1l;

    public ExcepcionGarantia(String message){
        super(message);
    }
}
