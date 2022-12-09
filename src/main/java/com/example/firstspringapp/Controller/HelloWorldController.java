package com.example.firstspringapp.Controller;

import com.example.firstspringapp.Model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    // UC1
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String Hello(){
        return "Hello Ashutosh";
    }
@RequestMapping("/sayhello")
    public String SayHelloDiffrently(){

        return "Hello Bridgelabz";
}
// UC2 ------->
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String name){
        return "Hello"+name+"From Bridgelabz!!!";
    }
    // UC3--------->
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello Mr/Mrs"+name+"!!";
    }
    // UC4-------->
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello"+user.getFirstName()+" "+user.getLastName()+" from Bridgelabz";
    }
}
