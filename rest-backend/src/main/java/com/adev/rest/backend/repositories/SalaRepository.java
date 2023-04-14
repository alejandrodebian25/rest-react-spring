package com.adev.rest.backend.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.adev.rest.backend.entities.SalaEntity;

public interface SalaRepository extends CrudRepository<SalaEntity,Long>{

    public List<SalaEntity> findAll();
}
