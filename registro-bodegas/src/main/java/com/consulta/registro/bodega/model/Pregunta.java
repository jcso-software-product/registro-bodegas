package com.consulta.registro.bodega.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "preguntas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pregunta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String pregunta;

    @ManyToOne(fetch = FetchType.EAGER)
    private List<Respuesta> respuestas;


}
