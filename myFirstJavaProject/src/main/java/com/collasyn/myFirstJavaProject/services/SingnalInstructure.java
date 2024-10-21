package com.collasyn.myFirstJavaProject.services;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class SingnalInstructure {

    public String returnAction(String signalColour){
        System.out.println(signalColour);
        if(Objects.equals(signalColour, "GREEN")){
            return "GO";
        }
        return "NOTHING";
    }
}
