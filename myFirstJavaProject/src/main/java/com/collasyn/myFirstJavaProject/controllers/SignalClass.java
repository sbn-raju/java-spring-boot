package com.collasyn.myFirstJavaProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignalClass {

    @GetMapping("/signal")
    public String signal(){
        return "RETURNING GREEN SIGNAL";
    }
}
