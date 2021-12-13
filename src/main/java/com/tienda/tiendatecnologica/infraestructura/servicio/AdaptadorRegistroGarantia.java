package com.tienda.tiendatecnologica.infraestructura.servicio;

import com.tienda.tiendatecnologica.Dominio.modelo.RegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRespuestaCreacionGarantia;
import com.tienda.tiendatecnologica.Dominio.puerto.RepositorioRegistroGarantia;
import org.springframework.stereotype.Repository;

@Repository
public class AdaptadorRegistroGarantia implements RepositorioRegistroGarantia {

    @Override
    public DtoRespuestaCreacionGarantia crear(RegistroGarantia garantia) {
        return null;
    }
}
