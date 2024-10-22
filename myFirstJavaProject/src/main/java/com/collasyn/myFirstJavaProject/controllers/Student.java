package com.collasyn.myFirstJavaProject.controllers;

import com.collasyn.myFirstJavaProject.entity.StudentClass;
import com.collasyn.myFirstJavaProject.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Student {



    @Autowired
    StudentServices studentServices;


    //Set Student Name
    @PostMapping("/add/student")
    public void addStudent(@RequestBody StudentClass student){
        int idStudent = student.getId();
        String nameStudent = student.getName();

        studentServices.addStudent(idStudent, nameStudent);
    }


    @GetMapping("/get")
    public Map<Integer, String> getStudent(){
        return studentServices.getMap();
    }
    
}
