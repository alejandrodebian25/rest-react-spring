package com.adev.rest.backend.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "autor")
@Table( name = "autor")
public class AutorEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String nombres;
    private String apellidos;
    private Integer edad;
    private String nacionalidad;

}
