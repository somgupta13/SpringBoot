package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class DemoJun2Application {
    @RequestMapping("/")
    String home() {
        return "Hello World Som";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoJun2Application.class, args);
    }

}
