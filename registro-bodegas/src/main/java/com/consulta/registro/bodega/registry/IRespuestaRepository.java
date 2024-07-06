package com.consulta.registro.bodega.registry;

import com.consulta.registro.bodega.model.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta, Long> {
}
