package com.collasyn.myFirstJavaProject.controllers;

import com.collasyn.myFirstJavaProject.entity.Signla;
import com.collasyn.myFirstJavaProject.services.SingnalInstructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignalClass {

    @Autowired
    SingnalInstructure singnalInstructure;



    @PostMapping("/signal")
    public String signal(@RequestBody Signla signal){
        String str = signal.getSignal();
        return singnalInstructure.returnAction(str);
    }
}
