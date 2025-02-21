package com.MessagingApp;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/helloo")
    public String hello() {
        return "Hello from BridgeLabz";
    }
    @GetMapping("/helloo/query")
    public String dsayHello(@RequestParam(value="name",defaultValue="Guest") String name) {
        return "Hello " + name + " from BridgeLabz !";
    }



}
