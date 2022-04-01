package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class HelloWorldResource {

    @GetMapping()
    public String home(String message){
        message = "PROJETO MAVEN (SPRING INITIALIZR) CRIADO COM SUCESSO !!!";
        return message;
    }
}
