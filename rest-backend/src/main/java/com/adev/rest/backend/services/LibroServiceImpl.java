package com.adev.rest.backend.services;

import com.adev.rest.backend.entities.LibroEntity;
import com.adev.rest.backend.exceptions.ResourceNotFoundException;
import com.adev.rest.backend.payload.request.LibroRequest;
import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.repositories.LibroRepository;
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

    @Override
    public ResponseEntity<RestResponse> getAll() {
        List<LibroEntity> libros = libroRepository.findAll();

        RestResponse response=new RestResponse();
        response.list(libros);
        return new ResponseEntity<RestResponse>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RestResponse> createLibro(LibroRequest libroRequest) {
        LibroEntity libroEntity =new LibroEntity();
        BeanUtils.copyProperties(libroRequest,libroEntity);
        libroRepository.save(libroEntity);

        RestResponse response=new RestResponse();
        response.created(libroEntity);
        return new ResponseEntity<RestResponse>(response,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RestResponse> updateLibro(Long id,LibroRequest libroRequest) {
        LibroEntity libroEntity = libroRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Libro", "ID", id));

        libroEntity.setDescripcion(libroRequest.getDescripcion());
        libroEntity.setTitulo(libroRequest.getTitulo());
        libroEntity.setNroPaginas(libroRequest.getNroPaginas());
        libroRepository.save(libroEntity);

        RestResponse response=new RestResponse();
        response.updated(libroEntity);
        return  new ResponseEntity<RestResponse>(response,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RestResponse> delete(Long id) {
        LibroEntity libro = libroRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Libro", "ID", id));
        libroRepository.deleteById(id);

        RestResponse response=new RestResponse();
        response.deleted();
        return  new ResponseEntity<RestResponse>(response,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RestResponse> getLibroById(Long id) {
        LibroEntity libro = libroRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Libro", "ID", id));

        RestResponse response=new RestResponse();
        response.resourceById("libro",libro);
        return  new ResponseEntity<RestResponse>(response,HttpStatus.OK);
    }


}
