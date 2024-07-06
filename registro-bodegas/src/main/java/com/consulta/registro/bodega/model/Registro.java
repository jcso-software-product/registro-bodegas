package com.consulta.registro.bodega.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "registro")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.EAGER)
    private Empleado empleado;

    private LocalDateTime ingreso;

    private LocalDateTime salida;

    private String empresa;

    private String trabajo;



}
