package com.tienda.tiendatecnologica.Dominio.servicio;

import com.tienda.tiendatecnologica.Dominio.excepcion.ExcepcionVocales;
import com.tienda.tiendatecnologica.Dominio.modelo.RegistroGarantia;
import com.tienda.tiendatecnologica.Dominio.modelo.dto.DtoRespuestaCreacionGarantia;
import com.tienda.tiendatecnologica.Dominio.puerto.RepositorioRegistroGarantia;

public class ServicioCrearGarantia {

    private static final String NO_GARANTIA_EXTENDIDA = "Este producto no cuenta con garantia extendida";
    private static final char VOCAL_A='a', VOCAL_E='e', VOCAL_I='i', VOCAL_O='o', VOCAL_U='u';


    private RepositorioRegistroGarantia repositorioRegistroGarantia;

    public ServicioCrearGarantia(RepositorioRegistroGarantia repositorioRegistroGarantia) {
        this.repositorioRegistroGarantia = repositorioRegistroGarantia;
    }

    public DtoRespuestaCreacionGarantia ejecutar(RegistroGarantia registroGarantia){
        validarVocales(registroGarantia);
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

    public int validarVocales(RegistroGarantia registroGarantia) {
        int vocales = 0;
        for (int x = 0; x < registroGarantia.getCodigo().length(); x++) {
            if ((registroGarantia.getCodigo().charAt(x) == VOCAL_A) || (registroGarantia.getCodigo().charAt(x) == VOCAL_E) || (registroGarantia.getCodigo().charAt(x) == VOCAL_I) || (registroGarantia.getCodigo().charAt(x) == VOCAL_O) || (registroGarantia.getCodigo().charAt(x) == VOCAL_U)) {
                vocales++;
            }
        }
            if (vocales >= 3) {
                throw new ExcepcionVocales(NO_GARANTIA_EXTENDIDA);
            } else return vocales;


    }


}
