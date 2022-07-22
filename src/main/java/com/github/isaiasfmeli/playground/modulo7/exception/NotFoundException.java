package com.github.isaiasfmeli.playground.modulo7.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ApiException {

    public NotFoundException(String message) {
        super(message);
        setStatus(HttpStatus.NOT_FOUND);
    }

}
