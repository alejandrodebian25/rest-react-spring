package com.adev.rest.backend.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.adev.rest.backend.entities.CamaEntity;

public interface CamaRepository extends CrudRepository<CamaEntity, Long> {
    public List<CamaEntity> findAll();
}
