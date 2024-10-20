package com.collasyn.myFirstJavaProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {


    @GetMapping("/greet-time")
    public String greetByTime(){
        return "Good Morning!! From other controller";
    }
}
