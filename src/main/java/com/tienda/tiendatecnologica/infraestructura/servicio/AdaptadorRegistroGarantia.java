package com.tienda.tiendatecnologica.infraestructura.servicio;

import com.tienda.tiendatecnologica.Dominio.modelo.RegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRespuestaCreacionGarantia;
import com.tienda.tiendatecnologica.Dominio.puerto.RepositorioRegistroGarantia;
import com.tienda.tiendatecnologica.infraestructura.adaptador.entidad.RegistroGarantiaEntity;
import com.tienda.tiendatecnologica.infraestructura.mapper.MapperRegistroGarantia;
import com.tienda.tiendatecnologica.infraestructura.repositorio.RepositorioRegistroGarantiaJPA;
import org.springframework.stereotype.Repository;

@Repository
public class AdaptadorRegistroGarantia implements RepositorioRegistroGarantia {
    private RepositorioRegistroGarantiaJPA repositorioRegistroGarantiaJPA;
    private MapperRegistroGarantia mapperRegistroGarantia;

    public AdaptadorRegistroGarantia(RepositorioRegistroGarantiaJPA repositorioRegistroGarantiaJPA, MapperRegistroGarantia mapperRegistroGarantia) {
        this.repositorioRegistroGarantiaJPA = repositorioRegistroGarantiaJPA;
        this.mapperRegistroGarantia = mapperRegistroGarantia;
    }

    @Override
    public DtoRespuestaCreacionGarantia crear(RegistroGarantia garantia) {
        RegistroGarantiaEntity registroGarantiaEntity = mapperRegistroGarantia.mapperDominioToEntity(garantia);
        repositorioRegistroGarantiaJPA.save(registroGarantiaEntity);
        return mapperRegistroGarantia.mapperEntityToDtoRespuestaCreacionGarantia(registroGarantiaEntity);
    }

}
