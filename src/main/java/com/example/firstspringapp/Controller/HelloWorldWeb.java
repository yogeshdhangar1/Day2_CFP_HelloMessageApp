package com.example.firstspringapp.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class HelloWorldWeb {
    @GetMapping("/web")
    public String SayHello(){
        return "Say Hello Amar And Ashutosh";
    }
   @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","This Is Custom Message.Hello From Bridgelabz");
        return "Hello From Bridgelabz";
   }

}
