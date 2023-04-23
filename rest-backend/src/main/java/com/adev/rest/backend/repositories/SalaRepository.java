package com.adev.rest.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.adev.rest.backend.entities.SalaEntity;

public interface SalaRepository extends CrudRepository<SalaEntity,Long>{

    public List<SalaEntity> findAll();

    @Query("SELECT s ,s.hospital FROM SalaEntity s WHERE s.hospital.id = :idHospital AND s.servicio.id = :idServicio")
    List<SalaEntity> obtenerSalasPorHospitalYServicio(@Param("idHospital") Long idHospital, @Param("idServicio") Long idServicio);

}
