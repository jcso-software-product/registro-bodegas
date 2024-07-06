package com.consulta.registro.bodega.service;

import com.consulta.registro.bodega.model.TipoTrabajador;
import com.consulta.registro.bodega.registry.ITipoTrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoTrabajadorService {

    @Autowired
    ITipoTrabajadorRepository trabajadorRepository;

    public TipoTrabajador crear(TipoTrabajador tipoTrabajador){
        return trabajadorRepository.save(tipoTrabajador);
    }

    public TipoTrabajador editar(TipoTrabajador tipoTrabajador) throws Exception {
        TipoTrabajador tTrabajador = trabajadorRepository.findById(tipoTrabajador.getId()).orElse(null);

        if(tTrabajador == null){
            throw new Exception("Tipo de trabajador no existe");
        }

        tTrabajador.setTipoTrabajador(tipoTrabajador.getTipoTrabajador());

        return trabajadorRepository.save(tTrabajador);
        
    }

    public TipoTrabajador getTipoTrabajador(Long id){
        return trabajadorRepository.findById(id).orElse(null);
    }

}
