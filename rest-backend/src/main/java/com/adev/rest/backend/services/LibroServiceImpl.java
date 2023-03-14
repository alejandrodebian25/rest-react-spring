package com.adev.rest.backend.services;

import com.adev.rest.backend.entities.LibroEntity;
import com.adev.rest.backend.payload.request.LibroRequest;
import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.repositories.LibroRepository;
import com.adev.rest.backend.util.AppConstants;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService{

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private RestResponse restResponse;

    @Override
    public ResponseEntity<RestResponse> getAll() {
        List<LibroEntity> libros = libroRepository.findAll();
        restResponse.successList(libros);
        return new ResponseEntity<RestResponse>(restResponse, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RestResponse> createLibro(LibroRequest libroRequest) {
        LibroEntity libroEntity =new LibroEntity();
        BeanUtils.copyProperties(libroRequest,libroEntity);
        libroRepository.save(libroEntity);

        //RestResponse response = new RestResponse();
        restResponse.successCreate(libroEntity);
        return new ResponseEntity<RestResponse>(restResponse,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RestResponse> updateLibro(LibroRequest libroRequest) {
        LibroEntity libroEntity =new LibroEntity();
        BeanUtils.copyProperties(libroRequest,libroEntity);
        libroRepository.save(libroEntity);

        //RestResponse response = new RestResponse();
        restResponse.successCreate(libroEntity);
        return new ResponseEntity<RestResponse>(restResponse,HttpStatus.OK);
    }

}
