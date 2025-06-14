package com.inmemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.inmemory")
@RestController
public class InmemorysbApplication {

    public static void main(String[] args) {
        SpringApplication.run(InmemorysbApplication.class, args);
    }


    @GetMapping("/test1")
    public String test() {
        return "Hello, this is a test endpoint!";
    }
}
