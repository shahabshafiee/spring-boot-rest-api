package com.example.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHello {

    @RequestMapping("/hi")
    public String sayHi(){
        return "Hi";
    }
}
