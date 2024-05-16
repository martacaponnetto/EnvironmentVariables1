package com.example.demo.EnvironmentVariables1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetingcontroller {
    @Autowired
    private Environment environment;
    @GetMapping("/greeting")
    public String greeting(){
        String devName = environment.getProperty("devName");
        String authCode = environment.getProperty("authCode");
        return "GoodMorning " + devName +  ", your authCode is : " + authCode;

    }

}
