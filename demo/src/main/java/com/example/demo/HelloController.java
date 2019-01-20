
package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/greeting")
    String greeting() {
    	return "Greeting from Spring Boot";
    }

}