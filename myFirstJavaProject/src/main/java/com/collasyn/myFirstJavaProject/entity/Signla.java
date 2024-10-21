package com.collasyn.myFirstJavaProject.entity;

import org.springframework.stereotype.Component;

@Component
public class Signla {

    private String signal;

    public String getSignal(){
        return signal;

    }

    public void setSignal( String signal){
        this.signal = signal;
    }
}
