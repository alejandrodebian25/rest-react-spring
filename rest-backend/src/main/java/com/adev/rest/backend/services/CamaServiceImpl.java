package com.adev.rest.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.adev.rest.backend.entities.CamaEntity;
import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.repositories.CamaRepository;

@Service
public class CamaServiceImpl implements CamaService{
    
    @Autowired
    private CamaRepository repository;

    RestResponse response;

    @Override
    public ResponseEntity<RestResponse> getAll() {
        List<CamaEntity> salasEntity = repository.findAll();

        response = new RestResponse();
        response.list("camas", salasEntity);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<RestResponse> obtenerCamasPorSala(Long idSala) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerCamasPorSala'");
    }


    
}
