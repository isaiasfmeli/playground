package com.github.isaiasfmeli.playground.modulo7.exception;

import org.springframework.beans.NotWritablePropertyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiExceptionDTO> handlerApiException(ApiException ex) {
        return new ResponseEntity<>(ex.getDTO(), ex.getStatus());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiExceptionDTO> handlerMethodException(MethodArgumentNotValidException exception) {
        ApiException ex = new ApiException(exception.getFieldError().getDefaultMessage());
        ex.setStatus(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(ex.getDTO(), ex.getStatus());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ApiExceptionDTO> handlerHttpMessageNotReadable(HttpMessageNotReadableException exception) {
        ApiException ex = new ApiException(exception.getLocalizedMessage());
        ex.setStatus(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(ex.getDTO(), ex.getStatus());
    }

    @ExceptionHandler(NotWritablePropertyException.class)
    public ResponseEntity<ApiExceptionDTO> handlerNotWritableProperty(NotWritablePropertyException exception) {
        ApiException ex = new ApiException(String.format("O campo '%s' não existe.", exception.getPropertyName()));
        ex.setStatus(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(ex.getDTO(), ex.getStatus());
    }

}
