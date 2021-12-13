package com.tienda.tiendatecnologica.infraestructura.configuracion;

import com.tienda.tiendatecnologica.Aplicacion.fabrica.FabricaCrearGarantia;
import com.tienda.tiendatecnologica.Aplicacion.manejador.ManejadorCrearGarantia;
import com.tienda.tiendatecnologica.Dominio.puerto.RepositorioRegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.servicio.ServicioCrearGarantia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioCrearGarantia servicioCrearGarantia (RepositorioRegistroGarantia repositorioRegistroGarantia){
        return new ServicioCrearGarantia(repositorioRegistroGarantia);
    }

    @Bean
    public ManejadorCrearGarantia manejadorCrearGarantia(ServicioCrearGarantia servicioCrearGarantia, FabricaCrearGarantia fabricaCrearGarantia){
        return new ManejadorCrearGarantia(servicioCrearGarantia,fabricaCrearGarantia);
    }
}
