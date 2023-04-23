package com.adev.rest.backend.payload.response;

import com.adev.rest.backend.entities.HospitalEntity;
import com.adev.rest.backend.entities.ServicioEntity;

import lombok.Data;

@Data
public class SalaResponse {



    private Long id;

    private String codigo;

    private String descripcion;

    private String ubicacion;
    
    private HospitalEntity hospital;
    
    private ServicioEntity servicio ;


}
