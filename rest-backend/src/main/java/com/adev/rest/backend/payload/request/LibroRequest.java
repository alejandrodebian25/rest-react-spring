package com.adev.rest.backend.payload.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LibroRequest {

    private Long id;

    @NotBlank(message = "Titulo vacio")
    private String titulo;

    @NotBlank
    private String descripcion;
    private Integer nroPaginas;
}
