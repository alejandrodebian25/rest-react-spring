package com.adev.rest.backend.repositories;

import com.adev.rest.backend.entities.HospitalEntity;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HospitalRepository extends CrudRepository<HospitalEntity, Long> {
    public List<HospitalEntity> findAll();

    //Para paginacion
    public Page<HospitalEntity> findAll(Pageable pageable);

}
