package com.example.todoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecomendationsController {

    //"To-do Application !"출력
    @GetMapping("/")
    public String HelloWorld(){
        return "To-do Application !";

    }

}
