package com.adev.rest.backend.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table( name = "autor",indexes = {@Index(columnList = "id,nombre,apellido,edad,nacionalidad")})
public class AutorEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @OrderColumn
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "autor_id")
    private List<LibroEntity> libros;
}
