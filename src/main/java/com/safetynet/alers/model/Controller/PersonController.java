package com.safetynet.alers.model.Controller;


import com.safetynet.alers.model.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private IPersonService personService;

    // TODO: implement controller methods
}