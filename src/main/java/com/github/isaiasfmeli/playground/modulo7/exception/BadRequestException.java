package com.github.isaiasfmeli.playground.modulo7.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends ApiException {

    public BadRequestException(String message) {
        super(message);
        setStatus(HttpStatus.BAD_REQUEST);
    }

}
