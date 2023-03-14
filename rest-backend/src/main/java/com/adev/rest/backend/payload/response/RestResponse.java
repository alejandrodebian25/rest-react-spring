package com.adev.rest.backend.payload.response;

import com.adev.rest.backend.util.AppConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class RestResponse {
    private String status;
    private String message;
    private Object data;
    private Object errors;

    public void successList (Object data){
        this.status= AppConstants.STATUS.SUCCESS;
        this.message="Registros encontrados.";
        this.data=data;
    }

    public void successCreate (Object data){
        this.status= AppConstants.STATUS.SUCCESS;
        this.message="Registro creado";
        this.data=data;
    }

    public void errorArgumentNotValid(Object errors){
        this.status= AppConstants.STATUS.FAIL;
        this.message="Campo(s) no valido(s)";
        this.data=null;
        this.errors=errors;
    }

}
