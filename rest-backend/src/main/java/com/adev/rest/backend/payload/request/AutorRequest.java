package com.adev.rest.backend.payload.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AutorRequest {
    private Long id;
    private String nombres;
    private String apellidos;
    private String nacionalidad;
    private Integer edad;
}
