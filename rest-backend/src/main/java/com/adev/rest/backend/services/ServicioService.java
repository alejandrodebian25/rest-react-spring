package com.adev.rest.backend.services;

import org.springframework.http.ResponseEntity;

import com.adev.rest.backend.payload.request.ServicioRequest;
import com.adev.rest.backend.payload.response.RestResponse;

public interface ServicioService {

    public ResponseEntity<RestResponse> getAll();

    public ResponseEntity<RestResponse> create(ServicioRequest request);

    public ResponseEntity<RestResponse> update(Long id, ServicioRequest request);

    public ResponseEntity<RestResponse> delete(Long id);

    public ResponseEntity<RestResponse> getResourceById(Long id);
    
}
