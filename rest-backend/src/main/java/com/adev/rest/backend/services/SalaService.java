package com.adev.rest.backend.services;

import org.springframework.http.ResponseEntity;

import com.adev.rest.backend.payload.request.SalaRequest;
import com.adev.rest.backend.payload.response.RestResponse;

public interface SalaService {
    public ResponseEntity<RestResponse> getAll();

    public ResponseEntity<RestResponse> create(SalaRequest request);

    public ResponseEntity<RestResponse> update(Long id, SalaRequest request);

    public ResponseEntity<RestResponse> delete(Long id);

    public ResponseEntity<RestResponse> getResourceById(Long id);

    public ResponseEntity<RestResponse> obtenerSalasPorServicioPorHospital(Long idHospital, Long idServicio );
}
