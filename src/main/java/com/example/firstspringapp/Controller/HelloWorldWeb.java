package com.example.firstspringapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldWeb {
    @GetMapping("/web")
    public String SayHello(){
        return "Say Hello Amar And Ashutosh";
    }
    @GetMapping("/web/message")
    public String message(@RequestBody String name, String city){

        return "Hello:"+name+city;
    }
}
