package com.example.todoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecomendationsController {
    @GetMapping("/")
    public String HelloWorld(){
        return "To-do Application !";
    }

}
