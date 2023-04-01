package com.adev.rest.backend.repositories;

import com.adev.rest.backend.entities.AutorEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AutorRepository extends CrudRepository <AutorEntity,Long>{
    public List<AutorEntity> findAll();
}
