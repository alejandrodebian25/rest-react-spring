package com.adev.rest.backend.services;

import org.springframework.http.ResponseEntity;

import com.adev.rest.backend.payload.response.RestResponse;

public interface CamaService {
    
    public ResponseEntity<RestResponse> getAll();

    public ResponseEntity<RestResponse> obtenerCamasPorSala(Long idSala );
}
