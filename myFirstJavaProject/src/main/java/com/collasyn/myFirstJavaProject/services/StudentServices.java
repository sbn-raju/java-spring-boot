package com.collasyn.myFirstJavaProject.services;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StudentServices {


    private final Map<Integer, String> map = new HashMap<>();


    public void addStudent(int id, String name){
        map.put(id, name);
    }

    public Map<Integer, String> getMap() {
        return map;
    }
}
