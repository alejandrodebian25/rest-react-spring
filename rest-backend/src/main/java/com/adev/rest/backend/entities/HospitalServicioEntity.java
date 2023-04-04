package com.adev.rest.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    @JsonIgnoreProperties({"hospitalServicio","servicio","id"})
    @ManyToOne(optional = true,  fetch = FetchType.EAGER)
    @JoinColumn (name = "hospital_id", referencedColumnName = "id")
    private HospitalEntity hospital;

    @JsonIgnoreProperties({"hospitalServicio"})
    @ManyToOne(optional = true,  fetch = FetchType.EAGER)
    @JoinColumn (name = "servicio_id", referencedColumnName = "id")
    private ServicioEntity servicio;
}
