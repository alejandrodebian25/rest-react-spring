package com.adev.rest.backend.exceptions;

import com.adev.rest.backend.payload.response.RestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class RestControllerExceptionHandler {

    /*
    * Este metodo valida los argumentos en las peticiones */
    @ExceptionHandler({ MethodArgumentNotValidException.class })
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<RestResponse> resolveException(MethodArgumentNotValidException ex) {
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        Map<String, String> response = new HashMap<>();

        for (FieldError error : fieldErrors) {
            response.put(error.getField(),error.getDefaultMessage());
        }
        RestResponse restResponse=new RestResponse();
        restResponse.errorArgumentNotValid(response);
        return new ResponseEntity<RestResponse>(restResponse, HttpStatus.BAD_REQUEST);
    }
}
