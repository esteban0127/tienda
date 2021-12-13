package com.tienda.tiendatecnologica.Dominio.puerto;

import com.tienda.tiendatecnologica.Dominio.modelo.RegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRespuestaCreacionGarantia;

public interface RepositorioRegistroGarantia {
    /**
     * Permite Crear los registros de una Garantia extendida de un producto
     * @param garantia
     * @return
     */
    DtoRespuestaCreacionGarantia crear(RegistroGarantia garantia);
}
