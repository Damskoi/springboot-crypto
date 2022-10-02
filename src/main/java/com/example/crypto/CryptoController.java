package com.example.crypto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CryptoController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}