package com.safetynet.alers.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class MedicalRecordAlreadyExistsException extends RuntimeException {

    public MedicalRecordAlreadyExistsException(String message) {
        super(message);
    }
}
