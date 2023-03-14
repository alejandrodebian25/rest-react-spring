package com.adev.rest.backend.repositories;

import com.adev.rest.backend.entities.LibroEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibroRepository extends CrudRepository<LibroEntity, Long> {
    public List<LibroEntity> findAll();

}
