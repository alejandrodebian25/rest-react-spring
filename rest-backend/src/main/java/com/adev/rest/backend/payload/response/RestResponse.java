package com.adev.rest.backend.payload.response;

import com.adev.rest.backend.util.AppConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class RestResponse {
    private String status;
    private String message;
    private Object data;
    private Object errors;

    /*============= Metodos de repuesta OK*/
    public void list (Object data){
        this.status= AppConstants.STATUS.SUCCESS;
        this.message="Registros encontrados.";
        this.data=data;
    }

    public void created (Object data){
        this.status= AppConstants.STATUS.SUCCESS;
        this.message="Registro creado";
        this.data=data;
    }

    public void updated (Object data){
        this.status= AppConstants.STATUS.SUCCESS;
        this.message="Registro actualizado con éxito";
        this.data=data;
    }

    public void deleted(){
        this.status= AppConstants.STATUS.SUCCESS;
        this.message="Registro eliminado con éxito";
    }

    public void resourceById(String keyData,Object data){
        this.status= AppConstants.STATUS.SUCCESS;
        this.message="Registro encontrado con éxito";

        Map<String, Object> dataAux = new HashMap<>();
        dataAux.put(keyData,data);
        this.data=dataAux;
    }

    /*============= Metodos de repuesta FAIL*/
    public void errorArgumentNotValid(Object errors){
        this.status= AppConstants.STATUS.FAIL;
        this.message="Campo(s) no valido(s)";
        this.data=null;
        this.errors=errors;
    }

}
