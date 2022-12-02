package com.siiweb.support.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DummyEndpoint {
    @GetMapping("/test")
    public String demo(){
        return "<h2>String Test</h2>";
    }
    @GetMapping("/")
    public String home(){
        return "<h2>home</h2>";
    }
}
