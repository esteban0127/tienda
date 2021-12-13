package com.tienda.tiendatecnologica.infraestructura.repositorio;

import com.tienda.tiendatecnologica.infraestructura.adaptador.entidad.RegistroGarantiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioRegistroGarantiaJPA extends JpaRepository<RegistroGarantiaEntity,Integer> {
}
