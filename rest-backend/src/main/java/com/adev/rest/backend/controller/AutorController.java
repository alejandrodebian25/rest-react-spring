package com.adev.rest.backend.controller;

import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/autores")
public class AutorController {

    @Autowired
    private AutorService service;

    @GetMapping
    public ResponseEntity<RestResponse> getAll(){
        return  service.getAll();
    }
}
