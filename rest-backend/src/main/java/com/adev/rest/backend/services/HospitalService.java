package com.adev.rest.backend.services;

import com.adev.rest.backend.payload.request.HospitalRequest;
import com.adev.rest.backend.payload.response.RestResponse;
import org.springframework.http.ResponseEntity;

public interface HospitalService {
    public ResponseEntity<RestResponse> getAll();

    public ResponseEntity<RestResponse> create(HospitalRequest request);

    public ResponseEntity<RestResponse> update(Long id, HospitalRequest request);

    public ResponseEntity<RestResponse> delete(Long id);

    public ResponseEntity<RestResponse> getResourceById(Long id);
}
