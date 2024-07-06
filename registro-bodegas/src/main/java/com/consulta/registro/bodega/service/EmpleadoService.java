package com.consulta.registro.bodega.service;

import com.consulta.registro.bodega.model.Empleado;
import com.consulta.registro.bodega.registry.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    @Autowired
    IEmpleadoRepository empleadoRepository;

    public Empleado getEmpleado(String registro){
        return empleadoRepository.findByRegistro(registro);
    }

    public Empleado crear(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public Empleado editar(Empleado empleado) throws Exception {
        Empleado emp = empleadoRepository.findById(empleado.getId()).orElse(null);

        if(emp == null){
            throw new Exception("Usuario no registrado");
        }

        emp.setCorreo(empleado.getCorreo());
        emp.setNombre(empleado.getNombre());
        emp.setRegistro(empleado.getRegistro());
        emp.setTipoTrabajador(empleado.getTipoTrabajador());

        return empleadoRepository.save(emp);

    }

    public void eliminar(Long id){
        empleadoRepository.deleteById(id);
    }

}
