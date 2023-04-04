package com.adev.rest.backend.services;

import com.adev.rest.backend.entities.AutorEntity;
import com.adev.rest.backend.entities.HospitalEntity;
import com.adev.rest.backend.payload.request.HospitalRequest;
import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.repositories.AutorRepository;
import com.adev.rest.backend.repositories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService{

    @Autowired
    private HospitalRepository repository;

    @Override
    public ResponseEntity<RestResponse> getAll() {
        List<HospitalEntity> hospitales = repository.findAll();

        RestResponse response=new RestResponse();
        response.list("hospitales",hospitales);
        return new ResponseEntity<RestResponse>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RestResponse> create(HospitalRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<RestResponse> update(Long id, HospitalRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<RestResponse> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<RestResponse> getResourceById(Long id) {
        return null;
    }
}
