package com.resul.reactuserbackend.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorDto {
    private String message;
    private int statusCode;
    private LocalDateTime timestamp;
}
