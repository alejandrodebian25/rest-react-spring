package com.adev.rest.backend.controller;

import com.adev.rest.backend.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adev.rest.backend.payload.response.RestResponse;

@RestController
@RequestMapping("/api/v1/servicios")
public class ServicioController {
    
    @Autowired
    private ServicioService service;

    @GetMapping
    public ResponseEntity<RestResponse> getAll(){
        return  service.getAll();
    }
}
