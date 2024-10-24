package com.collasyn.myFirstJavaProject.controllers;


import com.collasyn.myFirstJavaProject.entity.CustomerClass;
import com.collasyn.myFirstJavaProject.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.SysexMessage;
import java.util.Map;

@RestController
public class Customer {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add/customer")
    public void addCustomer(@RequestBody CustomerClass customer){
        System.out.println((customer));
        int id = customer.getId();
        String name = customer.getName();
        String address = customer.getAddress();
        customerService.addCustomer(id, name, address);
    }

    @GetMapping()
    public Map<Integer, Map<String, String>> getCustomer(){
        return customerService.getCustomer();
    }
}
