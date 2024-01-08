package com.outing.commons.api.response;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.List;

public class OutingResponse<T> extends ResponseEntity<OutingResponseBody<T>> {

    public OutingResponse(T body){
        super(new OutingResponseBody<>(body,null),null, HttpStatus.OK);
    }

    public OutingResponse(T body,String message){
        super(new OutingResponseBody<>(body, List.of(message)),null, HttpStatus.OK);
    }

    public OutingResponse(T body,HttpStatus status){
        super(new OutingResponseBody<>(body, null),null, status);
    }

    public OutingResponse(T body,HttpStatus status,String message){
        super(new OutingResponseBody<>(body, List.of(message)),null, status);
    }
    public OutingResponse(T body,HttpStatus status,List<String> messages){
        super(new OutingResponseBody<>(body, messages),null, status);
    }
}
