package com.adev.rest.backend.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "servicio")
public class ServicioEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String codigo;

    @Column(length = 100)
    private String descripcion;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "servicio_id")
//    private List<HospitalServicioEntity> hospitalServicio;

    @OneToMany(mappedBy = "servicio")
    private List<HospitalServicioEntity> hospitalServicio;
}
