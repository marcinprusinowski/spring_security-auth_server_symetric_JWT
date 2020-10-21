package com.example.resourceserver;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/auth")
    public String auth(){
        return "Authorized";
    }
}
