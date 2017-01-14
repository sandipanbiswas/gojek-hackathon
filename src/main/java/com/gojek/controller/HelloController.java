package com.gojek.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

     public String index() {
        return "Greetings from Spring Boot!";
    }

}