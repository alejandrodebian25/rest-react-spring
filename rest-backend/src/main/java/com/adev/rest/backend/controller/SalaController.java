package com.adev.rest.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.services.SalaService;

@RestController
@RequestMapping("/api/v1/salas")
public class SalaController {
    
    @Autowired
    private SalaService service;

    @GetMapping
    public ResponseEntity<RestResponse> getAll(){
        return  service.getAll();
    }

    @GetMapping("/hospitales/{idHospital}/servicios/{idServicio}")
    public ResponseEntity<RestResponse> obtenerServiciosPorHospital(@PathVariable Long idHospital,@PathVariable Long idServicio) {
        return service.obtenerSalasPorServicioPorHospital(idHospital,idServicio);
    }

}
