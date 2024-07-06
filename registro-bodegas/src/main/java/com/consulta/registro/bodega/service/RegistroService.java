package com.consulta.registro.bodega.service;

import com.consulta.registro.bodega.model.Registro;
import com.consulta.registro.bodega.registry.IRegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {

    @Autowired
    IRegistroRepository registroRepository;

    public Registro crear(Registro registro){
        return registroRepository.save(registro);
    }

    public Registro editar(Registro registro) throws Exception {
        Registro reg = registroRepository.findById(registro.getId()).orElse(null);

        if(reg == null){
            throw new Exception("No existe el registro");
        }

        reg.setEmpleado(registro.getEmpleado());
        reg.setEmpresa(registro.getEmpresa());
        reg.setIngreso(registro.getIngreso());
        reg.setSalida(registro.getSalida());
        reg.setTrabajo(registro.getTrabajo());

        return registroRepository.save(reg);
    }

    public List<Registro> buscar(){
        return registroRepository.findAll();
    }
}
