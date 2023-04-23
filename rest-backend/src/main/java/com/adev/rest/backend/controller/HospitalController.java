package com.adev.rest.backend.controller;

import com.adev.rest.backend.entities.HospitalEntity;
import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hospitales")
public class HospitalController {

    @Autowired
    private HospitalService service;

    @GetMapping
    public ResponseEntity<RestResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}/servicios")
    public ResponseEntity<RestResponse> obtenerServiciosPorHospital(@PathVariable Long id) {
        return service.obtenerServiciosPorHospital(id);
    }

    @GetMapping("/paginado")
    public Page<HospitalEntity> obtenerPorHospitalPaginado(
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "10") Integer size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return service.obtenerHospitalesPage(pageable);
    }


}
