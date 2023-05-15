package com.safetynet.alers.model.Controller;

import com.safetynet.alers.model.service.IFireStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FireStationController {

    @Autowired
    private IFireStationService fireStationService;

    // TODO: implement controller methods
}