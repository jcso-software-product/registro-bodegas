package com.consulta.registro.bodega.registry;

import com.consulta.registro.bodega.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {

    Empleado findByRegistro(String registro);
}
