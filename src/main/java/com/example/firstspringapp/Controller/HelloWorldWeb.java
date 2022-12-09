package com.example.firstspringapp.Controller;

import com.example.firstspringapp.Model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
   @PutMapping("/web/firstName")
    public String msg(User user){
        user.getFirstName();
        return "hello My First Name Is Yogesh";
   }
}
