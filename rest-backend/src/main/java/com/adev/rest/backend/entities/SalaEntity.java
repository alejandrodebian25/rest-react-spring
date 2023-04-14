package com.adev.rest.backend.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "sala")
public class SalaEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(length = 50)
    private String codigo;

    @Column(length = 100)
    private String descripcion;

    @Column(length = 50)
    private String ubicacion;
    
    @ManyToOne(optional = true,  fetch = FetchType.EAGER)
    private HospitalEntity hospital;

    @ManyToOne(optional = true,  fetch = FetchType.EAGER)
    private ServicioEntity servicio ;

    @JsonIgnore
    @OneToMany(mappedBy = "sala")
    private List<CamaEntity> camas;

}
