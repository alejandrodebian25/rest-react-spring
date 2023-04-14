package com.adev.rest.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "hospital_servicio")
public class HospitalServicioEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @JsonIgnore
    @ManyToOne(optional = true,  fetch = FetchType.EAGER)
    @JoinColumn (name = "hospital_id", referencedColumnName = "id")
    private HospitalEntity hospital;

    @JsonIgnore
    @ManyToOne(optional = true,  fetch = FetchType.EAGER)
    @JoinColumn (name = "servicio_id", referencedColumnName = "id")
    private ServicioEntity servicio;
}
