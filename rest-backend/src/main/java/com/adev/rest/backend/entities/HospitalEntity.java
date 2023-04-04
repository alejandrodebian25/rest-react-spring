package com.adev.rest.backend.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "hospital")
public class HospitalEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(length = 50)
    private String codigo;

    @Column(length = 100)
    private String descripcion;

    @Column(length = 150)
    private String direccion;

    @OneToMany(mappedBy = "hospital")
    private List<HospitalServicioEntity> hospitalServicio;

}
