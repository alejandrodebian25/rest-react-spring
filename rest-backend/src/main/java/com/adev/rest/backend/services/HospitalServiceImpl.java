package com.adev.rest.backend.services;

import com.adev.rest.backend.entities.HospitalEntity;
import com.adev.rest.backend.entities.HospitalServicioEntity;
import com.adev.rest.backend.exceptions.ResourceNotFoundException;
import com.adev.rest.backend.payload.request.HospitalRequest;
import com.adev.rest.backend.payload.response.HospitalResponse;
import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.repositories.HospitalRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository repository;

    RestResponse response ;

    @Override
    public ResponseEntity<RestResponse> getAll() {

        ModelMapper modelMapper = new ModelMapper();
        List<HospitalEntity> hospitalesEntity = repository.findAll();

        List<HospitalResponse> hospitalesResponse = new ArrayList<>();

        for (HospitalEntity hospitalEntity : hospitalesEntity) {
            
            HospitalResponse hospitalResponse = modelMapper.map(hospitalEntity, HospitalResponse.class);

            List<Object> serviciosResponse = new ArrayList<>();

            for (HospitalServicioEntity servicioHospital : hospitalEntity.getHospitalServicio()) {

                Object servicio= new Object();
                servicio = servicioHospital.getServicio();
                serviciosResponse.add(servicio);
            }
            hospitalResponse.setServicios(serviciosResponse);
            hospitalesResponse.add(hospitalResponse);
        }

        response = new RestResponse();
        response.list("hospitales", hospitalesResponse);
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

    @Override
    public ResponseEntity<RestResponse> obtenerServiciosPorHospital(Long id) {

        HospitalEntity hospitalEntity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hospital", "ID", id));

        ModelMapper modelMapper = new ModelMapper();
        HospitalResponse hospitalResponse = modelMapper.map(hospitalEntity, HospitalResponse.class);

        List<Object> serviciosResponse = hospitalEntity.getHospitalServicio()
            .stream()
            .map(HospitalServicioEntity::getServicio)
            .collect(Collectors.toList());

                    hospitalResponse.setServicios(serviciosResponse);
        response = new RestResponse();
        response.list("hospital", hospitalResponse);
        return ResponseEntity.ok(response);
    }

    @Override
    public Page<HospitalEntity> obtenerHospitalesPage(Pageable pageable) {
        return repository.findAll(pageable);

    }

    
}
