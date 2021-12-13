package com.tienda.tiendatecnologica.infraestructura.controlador;


import com.tienda.tiendatecnologica.Aplicacion.comando.ComandoRegistroGarantia;
import com.tienda.tiendatecnologica.Aplicacion.manejador.ManejadorCrearGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRespuestaCreacionGarantia;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistroGarantiaControlador {
    private final ManejadorCrearGarantia manejadorCrearGarantia;

    @Autowired
    public RegistroGarantiaControlador(ManejadorCrearGarantia manejadorCrearGarantia){
        this.manejadorCrearGarantia=manejadorCrearGarantia;
    }

    @PostMapping
    @ApiOperation("crear")
    public DtoRespuestaCreacionGarantia crear(@RequestBody ComandoRegistroGarantia comandoRegistroGarantia){
        return  this.manejadorCrearGarantia.ejecutar(comandoRegistroGarantia);
    }

}
