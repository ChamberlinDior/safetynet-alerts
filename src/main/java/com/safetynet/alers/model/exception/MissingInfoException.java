package com.safetynet.alers.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MissingInfoException extends RuntimeException {

    public MissingInfoException(String message) {
        super(message);
    }
}
