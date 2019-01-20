
package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

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

    @GetMapping("/greeting/{name}")
    String greetingByName(@PathVariable String name) {
      return "Hello " + name + ", greeting from Spring Boot";
    }

    // 範例, 回傳JSON
    @GetMapping("/hello")
    public Map hello() {
      Map map = new HashMap();
      map.put("say", "hello");
      return map;
    }

}