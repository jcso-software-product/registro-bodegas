package com.consulta.registro.bodega.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "empleados")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String registro;
    @Column(nullable = false)
    private String nombre;

    @Column(unique = true, nullable = false)
    private String correo;

    @OneToOne(fetch = FetchType.EAGER)
    private TipoTrabajador tipoTrabajador;

}
