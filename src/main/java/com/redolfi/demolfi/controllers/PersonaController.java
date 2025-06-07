package com.redolfi.demolfi.controllers;

import com.redolfi.demolfi.entities.Persona;
import com.redolfi.demolfi.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.redolfi.demolfi.services.PersonaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

}
