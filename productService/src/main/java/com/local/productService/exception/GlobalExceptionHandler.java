package com.local.productService.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String> handleGenericException(GenericException ex){
        ResponseEntity response =ResponseEntity.status(ex.getHttpStatus()).body(ex.getMessage());
        return response;
    }
}
