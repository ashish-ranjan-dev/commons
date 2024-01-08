package com.outing.commons.api.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class OutingExceptionHandler {

    @ExceptionHandler({OutingException.class})
    public ResponseEntity<Object> handleException(OutingException ex){
        OutingExceptionModel apiOutingExceptionModel =new OutingExceptionModel(
                ZonedDateTime.now(),
                ex.getHttpStatus(),
                ex.getMessages()
        );
        return new ResponseEntity<>(apiOutingExceptionModel, ex.getHttpStatus());
    }
}
