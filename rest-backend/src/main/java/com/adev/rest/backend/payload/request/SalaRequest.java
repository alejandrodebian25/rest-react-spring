package com.adev.rest.backend.payload.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

public class SalaRequest {
    
    private Long id;

    @NotBlank
    @Max(30)
    private String codigo;

    @NotBlank
    @Max(100)
    private String descripcion;

    @NotBlank
    @Max(100)
    private String ubicacion;
}
