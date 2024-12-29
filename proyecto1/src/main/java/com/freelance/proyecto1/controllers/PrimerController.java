package com.freelance.proyecto1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimerController {

    @GetMapping("/")
    public String saludo(){
        return "Bienvenidos!!!";
    }

}
