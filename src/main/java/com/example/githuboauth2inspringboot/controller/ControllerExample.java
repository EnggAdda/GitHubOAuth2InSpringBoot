package com.example.githuboauth2inspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerExample {

    @GetMapping("/get")
    public String getMessage(){

        return "Hello EveryOne Welcome to Engg Adda";
    }
}
