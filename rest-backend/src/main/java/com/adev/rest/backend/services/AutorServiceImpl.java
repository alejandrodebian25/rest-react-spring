package com.adev.rest.backend.services;

import com.adev.rest.backend.entities.AutorEntity;
import com.adev.rest.backend.payload.request.AutorRequest;
import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl implements AutorService{

    @Autowired
    private AutorRepository autorRepository;
    @Override
    public ResponseEntity<RestResponse> getAll() {
        List<AutorEntity> autores = autorRepository.findAll();

        RestResponse response=new RestResponse();
        response.list(autores);
        return new ResponseEntity<RestResponse>(response, HttpStatus.OK);

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
