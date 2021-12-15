package com.tienda.tiendatecnologica.infraestructura.mapper;

import com.tienda.tiendatecnologica.Dominio.modelo.RegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRespuestaCreacionGarantia;
import com.tienda.tiendatecnologica.infraestructura.adaptador.entidad.RegistroGarantiaEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class MapperRegistroGarantia {

    public RegistroGarantiaEntity mapperDominioToEntity(RegistroGarantia registroGarantia){
        RegistroGarantiaEntity registroGarantiaEntity = null;
        registroGarantiaEntity = new RegistroGarantiaEntity(
                registroGarantia.getCodigo(),
                registroGarantia.getNombre(),
                registroGarantia.getCostoGarantia(),
                registroGarantia.getPrecioProducto(),
                registroGarantia.getFechaInicioGarantia(),
                registroGarantia.getFechaFinGarantia()
        );
        return registroGarantiaEntity;
    }

    public DtoRegistroGarantia mapperEntityToDoRegistroGarantia(RegistroGarantiaEntity registroGarantiaEntity){
        DtoRegistroGarantia registroGarantia = null;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        registroGarantia = new DtoRegistroGarantia(
                registroGarantiaEntity.getCodigo(),
                registroGarantiaEntity.getNombre(),
                registroGarantiaEntity.getCostoGarantia(),
                registroGarantiaEntity.getPrecioProducto(),
                registroGarantiaEntity.getFechaInicioGarantia(),
                registroGarantiaEntity.getFechaFinGarantia()
        );
        return registroGarantia;
    }
    public DtoRespuestaCreacionGarantia mapperEntityToDtoRespuestaCreacionGarantia(RegistroGarantiaEntity registroGarantiaEntity){
        DtoRespuestaCreacionGarantia dtoRespuestaCreacionGarantia = null;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dtoRespuestaCreacionGarantia = new DtoRespuestaCreacionGarantia(
                registroGarantiaEntity.getCodigo(),
                registroGarantiaEntity.getFechaFinGarantia()
        );
        return dtoRespuestaCreacionGarantia;
    }
}
