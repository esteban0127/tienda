package com.tienda.tiendatecnologica.Dominio.servicio;

import com.tienda.tiendatecnologica.Dominio.modelo.RegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRespuestaCreacionGarantia;
import com.tienda.tiendatecnologica.Dominio.puerto.RepositorioRegistroGarantia;

public class ServicioCrearGarantia {

    private RepositorioRegistroGarantia repositorioRegistroGarantia;

    public ServicioCrearGarantia(RepositorioRegistroGarantia repositorioRegistroGarantia) {
        this.repositorioRegistroGarantia = repositorioRegistroGarantia;
    }

    public DtoRespuestaCreacionGarantia ejecutar(RegistroGarantia registroGarantia){
        Double costoGarantia = calcularCostoGarantia(registroGarantia);
        registroGarantia.setCostoGarantia(costoGarantia);
        return this.repositorioRegistroGarantia.crear(registroGarantia);
    }

    public Double calcularCostoGarantia (RegistroGarantia registroGarantia){
        Double costoGarantia = null;
        if(registroGarantia.getPrecioProducto() > 500000){
            costoGarantia = registroGarantia.getPrecioProducto()*0.2;

        } else {
            costoGarantia = registroGarantia.getPrecioProducto()*0.1;
        }

        return costoGarantia;
    }


}
