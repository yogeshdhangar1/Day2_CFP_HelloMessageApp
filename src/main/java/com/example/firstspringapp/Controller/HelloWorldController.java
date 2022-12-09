package com.example.firstspringapp.Controller;

import org.springframework.web.bind.annotation.*;

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
// UC2 ------->
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String name){
        return "Hello"+name+"From Bridgelabz!!!";
    }
}
