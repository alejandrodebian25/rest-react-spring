package com.adev.rest.backend.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "cama")
public class CamaEntity implements Serializable{

    private static final long serialVersionUID = 1L;
        
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(length = 50)
    private String codigo;

    @Column(length = 50)
    private String estado;

    @Column(nullable = false)
    private Boolean esta_ocupado; 

    @JsonIgnore
    @ManyToOne(optional = true,  fetch = FetchType.EAGER)
    private SalaEntity sala  ;

}

