package com.collasyn.myFirstJavaProject.services;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CustomerService {

    private Map<Integer, Map<String, String>> map = new HashMap<>();
    private Map<String, String> map1  = new HashMap<>();

    public void addCustomer(int id, String name, String address){
        map1.put(name, address);
        map.put(id, map1);
    }

    public Map<Integer, Map<String, String>> getCustomer(){
        return map;
    }
}
