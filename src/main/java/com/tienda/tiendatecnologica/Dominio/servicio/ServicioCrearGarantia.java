package com.tienda.tiendatecnologica.Dominio.servicio;

import com.tienda.tiendatecnologica.Dominio.excepcion.ExcepcionVocales;
import com.tienda.tiendatecnologica.Dominio.modelo.RegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRespuestaCreacionGarantia;
import com.tienda.tiendatecnologica.Dominio.puerto.RepositorioRegistroGarantia;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ServicioCrearGarantia {

    private static final String NO_GARANTIA_EXTENDIDA = "Este producto no cuenta con garantia extendida";
    private static final char VOCAL_A='a', VOCAL_E='e', VOCAL_I='i', VOCAL_O='o', VOCAL_U='u';
    private static final double PRECIO_PRODUCTO = 500000;
    private static final int DIAS_GARANTIA = 200;
    private static final Double PORCENTAJE_GARANTIA_MAYOR500000 = 0.2;
    private static final Double PROCENTAJE_GARANTIA_MENOR500000 = 0.1;
    private static final int VOCALES = 3;


    private RepositorioRegistroGarantia repositorioRegistroGarantia;

    public ServicioCrearGarantia(RepositorioRegistroGarantia repositorioRegistroGarantia) {
        this.repositorioRegistroGarantia = repositorioRegistroGarantia;
    }

    public DtoRespuestaCreacionGarantia ejecutar(RegistroGarantia registroGarantia){
        validarVocales(registroGarantia);
        Double costoGarantia = calcularCostoGarantia(registroGarantia);
        registroGarantia.setCostoGarantia(costoGarantia);
        LocalDate fechaInicioGarantia = inicioFechaGarantia(registroGarantia);
        registroGarantia.setFechaInicioGarantia(fechaInicioGarantia);
        LocalDate fechaFinGarantia = validarDiaGarantia(registroGarantia);
        registroGarantia.setFechaFinGarantia(fechaFinGarantia);
        return this.repositorioRegistroGarantia.crear(registroGarantia);
    }

    public Double calcularCostoGarantia (RegistroGarantia registroGarantia){
        Double costoGarantia = null;
        if(registroGarantia.getPrecioProducto() > PRECIO_PRODUCTO){
            costoGarantia = registroGarantia.getPrecioProducto()*PORCENTAJE_GARANTIA_MAYOR500000;

        } else {
            costoGarantia = registroGarantia.getPrecioProducto()*PROCENTAJE_GARANTIA_MENOR500000;
        }

        return costoGarantia;
    }

    public int validarVocales(RegistroGarantia registroGarantia) {
        int vocales = 0;
        for (int x = 0; x < registroGarantia.getCodigo().length(); x++) {
            if ((registroGarantia.getCodigo().charAt(x) == VOCAL_A) || (registroGarantia.getCodigo().charAt(x) == VOCAL_E) || (registroGarantia.getCodigo().charAt(x) == VOCAL_I) || (registroGarantia.getCodigo().charAt(x) == VOCAL_O) || (registroGarantia.getCodigo().charAt(x) == VOCAL_U)) {
                vocales++;
            }
        }
            if (vocales >= VOCALES) {
                throw new ExcepcionVocales(NO_GARANTIA_EXTENDIDA);
            } else return vocales;


    }

    public LocalDate inicioFechaGarantia (RegistroGarantia registroGarantia){
        LocalDate fechaInicioGarantia = LocalDate.now();
        return fechaInicioGarantia;
    }


    public LocalDate validarDiaGarantia (RegistroGarantia registroGarantia){
         LocalDate fechaFinGarantia = null;
        if (registroGarantia.getPrecioProducto() > PRECIO_PRODUCTO){
            int dias = 0 ,lunes =0;
            while (dias<=DIAS_GARANTIA){
                fechaFinGarantia = registroGarantia.getFechaInicioGarantia().plusDays(dias+lunes);
                dias++;
                if (fechaFinGarantia.getDayOfWeek() == DayOfWeek.MONDAY){
                    lunes = lunes +1;
                }
            }
            if (fechaFinGarantia.getDayOfWeek() == DayOfWeek.MONDAY){
                fechaFinGarantia = fechaFinGarantia.plusDays(1);
            }else if (fechaFinGarantia.getDayOfWeek()== DayOfWeek.SUNDAY){
                fechaFinGarantia = fechaFinGarantia.plusDays(2);
            }
        }
        else {
            fechaFinGarantia = registroGarantia.getFechaInicioGarantia().plusDays(100);
        }
        return fechaFinGarantia;
    }


}
