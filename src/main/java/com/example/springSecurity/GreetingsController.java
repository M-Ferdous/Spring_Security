package com.example.springSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingsController {
    @GetMapping("/start")
    public String greet() {
        return "sn .................. tesing";
    }
}
