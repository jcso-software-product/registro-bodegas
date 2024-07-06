package com.consulta.registro.bodega.controller;

import com.consulta.registro.bodega.model.Empleado;
import com.consulta.registro.bodega.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleado/api/v1")
public class EmpleadoController {


    @Autowired
    EmpleadoService empleadoService;


    @GetMapping("/buscar/{registro}")
    public Empleado buscar(@PathVariable String registro){
        return empleadoService.getEmpleado(registro);
    }

    @PostMapping("/crear")
    public Empleado crear(@RequestBody Empleado empleado){
        return empleadoService.crear(empleado);
    }

    @PutMapping("/editar")
    public Empleado editar(@RequestBody Empleado empleado) throws Exception {
        return empleadoService.editar(empleado);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        empleadoService.eliminar(id);
    }

}
