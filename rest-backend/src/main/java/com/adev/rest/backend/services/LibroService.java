package com.adev.rest.backend.services;

import com.adev.rest.backend.payload.request.LibroRequest;
import com.adev.rest.backend.payload.response.RestResponse;
import org.springframework.http.ResponseEntity;

public interface LibroService {
    public ResponseEntity<RestResponse> getAll();
    
    public ResponseEntity<RestResponse> createLibro(LibroRequest libroRequest);

    public ResponseEntity<RestResponse> updateLibro(Long id,LibroRequest libroRequest);


}
