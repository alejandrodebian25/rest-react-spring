package com.adev.rest.backend.entities;

import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "libro")
@Data
@Table( name = "libro")
public class LibroEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nro_paginas")
    private Integer nroPaginas;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private AutorEntity autor;
}
