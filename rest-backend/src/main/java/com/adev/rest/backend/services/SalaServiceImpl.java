package com.adev.rest.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.adev.rest.backend.entities.SalaEntity;
import com.adev.rest.backend.payload.request.SalaRequest;
import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.repositories.SalaRepository;

@Service
public class SalaServiceImpl implements SalaService {

    @Autowired
    private SalaRepository repository;

    RestResponse response;

    @Override
    public ResponseEntity<RestResponse> getAll() {
        List<SalaEntity> salasEntity = repository.findAll();

        response = new RestResponse();
        response.list("salas", salasEntity);
        return new ResponseEntity<RestResponse>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RestResponse> create(SalaRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ResponseEntity<RestResponse> update(Long id, SalaRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity<RestResponse> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public ResponseEntity<RestResponse> getResourceById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResourceById'");
    }

    @Override
    public ResponseEntity<RestResponse> obtenerSalasPorServicioPorHospital(Long idHospital, Long idServicio) {
        List<SalaEntity> listSalasEntity = repository.obtenerSalasPorHospitalYServicio(idHospital, idServicio);
        
        response = new RestResponse();
        if (listSalasEntity.isEmpty()) {
            response.listFail();
        }else{
            response.list("salas", listSalasEntity);
        }

        return ResponseEntity.ok(response);
    }

}
