package com.adev.rest.backend.services;

import com.adev.rest.backend.payload.request.AutorRequest;
import com.adev.rest.backend.payload.response.RestResponse;
import org.springframework.http.ResponseEntity;

public interface AutorService {
    public ResponseEntity<RestResponse> getAll();

    public ResponseEntity<RestResponse> create(AutorRequest request);

    public ResponseEntity<RestResponse> update(Long id,AutorRequest request);

    public ResponseEntity<RestResponse> delete(Long id);

    public ResponseEntity<RestResponse> getAutorById(Long id);
}
