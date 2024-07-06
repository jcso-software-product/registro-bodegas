package com.consulta.registro.bodega.controller;

import com.consulta.registro.bodega.model.Registro;
import com.consulta.registro.bodega.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registro/api/v1")
public class RegistroController {

    @Autowired
    RegistroService registroService;

    @PostMapping("/crear")
    public Registro crear(@RequestBody Registro registro){
        return registroService.crear(registro);
    }

    @PutMapping("/editar")
    public Registro editar(@RequestBody Registro registro) throws Exception {
        return registroService.editar(registro);
    }

    @GetMapping("/buscar")
    public List<Registro> buscar(){
        return registroService.buscar();
    }

}
