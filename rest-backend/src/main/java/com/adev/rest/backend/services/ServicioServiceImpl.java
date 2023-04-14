package com.adev.rest.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.adev.rest.backend.entities.ServicioEntity;
import com.adev.rest.backend.payload.request.ServicioRequest;
import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.repositories.ServicioRepository;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository repository;

    RestResponse response;

    @Override
    public ResponseEntity<RestResponse> getAll() {

        List<ServicioEntity> servicios = repository.findAll();

        response = new RestResponse();
        response.list("servicios", servicios);
        return new ResponseEntity<RestResponse>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RestResponse> create(ServicioRequest request) {

        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ResponseEntity<RestResponse> update(Long id, ServicioRequest request) {

        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity<RestResponse> delete(Long id) {

        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public ResponseEntity<RestResponse> getResourceById(Long id) {

        throw new UnsupportedOperationException("Unimplemented method 'getResourceById'");
    }

}
