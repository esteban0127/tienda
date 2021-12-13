package com.tienda.tiendatecnologica.Aplicacion.manejador;

import com.tienda.tiendatecnologica.Aplicacion.comando.ComandoRegistroGarantia;
import com.tienda.tiendatecnologica.Aplicacion.fabrica.FabricaCrearGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.RegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRespuestaCreacionGarantia;
import com.tienda.tiendatecnologica.Dominio.servicio.ServicioCrearGarantia;

public class ManejadorCrearGarantia {
    private ServicioCrearGarantia servicioCrearGarantia;
    private FabricaCrearGarantia fabricaCrearGarantia;

    public ManejadorCrearGarantia(ServicioCrearGarantia servicioCrearGarantia, FabricaCrearGarantia fabricaCrearGarantia) {
        this.servicioCrearGarantia = servicioCrearGarantia;
        this.fabricaCrearGarantia = fabricaCrearGarantia;
    }

    public DtoRespuestaCreacionGarantia ejecutar(ComandoRegistroGarantia comandoRegistroGarantia){
        RegistroGarantia registroGarantia = fabricaCrearGarantia.crear(comandoRegistroGarantia);
        return servicioCrearGarantia.ejecutar(registroGarantia);
    }

}
