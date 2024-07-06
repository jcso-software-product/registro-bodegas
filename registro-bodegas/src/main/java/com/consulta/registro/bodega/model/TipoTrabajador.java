package com.consulta.registro.bodega.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "tipo_trabajador")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoTrabajador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoTrabajador;
}
