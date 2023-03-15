package com.adev.rest.backend.controller;

import com.adev.rest.backend.payload.request.LibroRequest;
import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService service;

    @GetMapping
    public ResponseEntity<RestResponse> getAll(){
        return  service.getAll();
    }

    @PostMapping
    public ResponseEntity<RestResponse> create(@Valid @RequestBody LibroRequest libroRequest){
        return service.createLibro(libroRequest);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RestResponse> update(@PathVariable(name = "id") Long id,@Valid @RequestBody LibroRequest libroRequest){
        return service.updateLibro(id,libroRequest);
    }
}
