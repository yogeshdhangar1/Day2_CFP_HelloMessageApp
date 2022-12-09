package com.example.firstspringapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // UC1
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String Hello(){
        return "Hello Ashutosh";
    }
@GetMapping("/sayhello")
    public String SayHelloDiffrently(){

        return "Hello Bridgelabz";
}
}
