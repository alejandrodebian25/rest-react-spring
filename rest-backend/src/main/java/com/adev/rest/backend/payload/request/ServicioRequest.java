package com.adev.rest.backend.payload.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class ServicioRequest {
    private Long id;

    @NotBlank
    @Max(30)
    private String codigo;

    @NotBlank
    @Max(100)
    private String descripcion;
    
}
