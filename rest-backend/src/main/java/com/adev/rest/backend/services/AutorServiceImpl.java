package com.adev.rest.backend.services;

import com.adev.rest.backend.payload.request.AutorRequest;
import com.adev.rest.backend.payload.response.RestResponse;
import org.springframework.http.ResponseEntity;

public class AutorServiceImpl implements AutorService{

    @Override
    public ResponseEntity<RestResponse> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<RestResponse> create(AutorRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<RestResponse> update(Long id, AutorRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<RestResponse> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<RestResponse> getAutorById(Long id) {
        return null;
    }
}
