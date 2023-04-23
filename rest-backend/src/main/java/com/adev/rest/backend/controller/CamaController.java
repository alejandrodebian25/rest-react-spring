package com.adev.rest.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.services.CamaService;

@RestController
@RequestMapping("/api/v1/camas")
public class CamaController {
    
    @Autowired
    private CamaService service;

    @GetMapping
    public ResponseEntity<RestResponse> getAll(){
        return  service.getAll();
    }
}
