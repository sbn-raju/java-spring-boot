package com.collasyn.myFirstJavaProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/greet")
    public String chiru(){
        return "Hello world! Welcome to java";
    }
}
