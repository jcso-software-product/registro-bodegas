package com.consulta.registro.bodega.controller;

import com.consulta.registro.bodega.model.TipoTrabajador;
import com.consulta.registro.bodega.service.TipoTrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tipoempledo/api/v1")
public class TipoEmpleadoController {

    @Autowired
    TipoTrabajadorService trabajadorService;

    @GetMapping("/buscar/{id}")
    public TipoTrabajador buscar(@PathVariable Long id){
        return trabajadorService.getTipoTrabajador(id);
    }

    @PostMapping("/crear")
    public TipoTrabajador crear(@RequestBody TipoTrabajador tipoTrabajador){
        return trabajadorService.crear(tipoTrabajador);
    }

    @PutMapping("/editar")
    public TipoTrabajador editar(@RequestBody TipoTrabajador tipoTrabajador) throws Exception {
        return trabajadorService.editar(tipoTrabajador);
    }



}
