package com.consulta.registro.bodega.registry;

import com.consulta.registro.bodega.model.TipoTrabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoTrabajadorRepository extends JpaRepository<TipoTrabajador, Long> {
}
