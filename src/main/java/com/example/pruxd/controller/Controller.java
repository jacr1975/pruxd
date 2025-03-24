package com.example.pruxd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping("/")
    String hello() {


        String s = "Hello World, Spring hey 241";
        return s;



    }

}
