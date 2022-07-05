package com.github.isaiasfmeli.playground.modulo3.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class NotFoundExceptionData {
    private String titulo;
    private int status;
    private String mensagem;
    private LocalDateTime timestamp;
}
