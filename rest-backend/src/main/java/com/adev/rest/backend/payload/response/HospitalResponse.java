package com.adev.rest.backend.payload.response;

import lombok.Data;

@Data
public class HospitalResponse {
    private Long id;
    private String codigo;
    private String descripcion;
    private String direccion;
    private Object servicios;
}
