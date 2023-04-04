package com.adev.rest.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.adev.rest.backend.entities.ServicioEntity;

import java.util.List;

public interface ServicioRepository extends CrudRepository <ServicioEntity,Long>{

    public List<ServicioEntity> findAll();
    
}
