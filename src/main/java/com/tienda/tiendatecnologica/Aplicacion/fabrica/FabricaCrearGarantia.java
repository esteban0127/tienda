package com.tienda.tiendatecnologica.Aplicacion.fabrica;

import com.tienda.tiendatecnologica.Aplicacion.comando.ComandoRegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.RegistroGarantia;
import org.springframework.stereotype.Component;

@Component
public class FabricaCrearGarantia {
    public RegistroGarantia crear(ComandoRegistroGarantia comandoRegistroGarantia){
        return new RegistroGarantia(
                comandoRegistroGarantia.getCodigo(),
                comandoRegistroGarantia.getPrecioProducto(),
                comandoRegistroGarantia.getFechaInicioGarantia()
        );
    }
}
