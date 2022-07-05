package com.github.isaiasfmeli.playground.modulo3.handler;

import com.github.isaiasfmeli.playground.modulo3.exception.NotFoundException;
import com.github.isaiasfmeli.playground.modulo3.exception.NotFoundExceptionData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ExHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<NotFoundExceptionData> handlerNotFoundEx(NotFoundException ex) {
        return new ResponseEntity<>(
                NotFoundExceptionData.builder()
                        .titulo("Objeto não encontrado")
                        .status(HttpStatus.NOT_FOUND.value())
                        .mensagem(ex.getMessage())
                        .timestamp(LocalDateTime.now())
                        .build(),
                HttpStatus.NOT_FOUND);
    }
}
