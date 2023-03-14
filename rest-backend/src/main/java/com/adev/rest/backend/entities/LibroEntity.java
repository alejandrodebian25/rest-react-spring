package com.adev.rest.backend.entities;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity(name = "libro")
@Data
@Table( name = "libro")
public class LibroEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String titulo;
    private String descripcion;
    private Integer nroPaginas;

}
