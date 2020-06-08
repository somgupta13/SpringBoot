package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping({ "/hello" })
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_CUST')")
    public String firstPage() {
        return "Hello World";
    }

}