package com.example.pruxd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping("/")
    String hello() {
        int h = 0;


        return "Hello World, Spring Boot552315!";



    }

}
