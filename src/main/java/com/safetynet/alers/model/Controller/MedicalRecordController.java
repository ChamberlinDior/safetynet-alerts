package com.safetynet.alers.model.Controller;

import com.safetynet.alers.model.service.IMedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicalRecordController {

    @Autowired
    private IMedicalRecordService medicalRecordService;

    // TODO: implement controller methods
}