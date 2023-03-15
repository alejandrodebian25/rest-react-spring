package com.adev.rest.backend.exceptions;

import com.adev.rest.backend.payload.response.RestResponse;
import com.adev.rest.backend.util.AppConstants;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException  {
    private static final long serialVersionUID = 1L;

    private transient RestResponse restResponse;

    private String resourceName;
    private String fieldName;
    private Object fieldValue;
    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super();
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.setRestResponse();
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public RestResponse getRestResponse() {
        return restResponse;
    }

    private void setRestResponse() {
        String message = String.format("%s no encontrado con %s: '%s'", resourceName, fieldName, fieldValue);

        restResponse = new RestResponse(AppConstants.STATUS.FAIL,message,null,null);
    }
}
