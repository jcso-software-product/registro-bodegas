package com.consulta.registro.bodega.registry;

import com.consulta.registro.bodega.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegistroRepository extends JpaRepository<Registro, Long> {
}
