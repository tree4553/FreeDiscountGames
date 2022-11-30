package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("data", "Hellooooo!!");
        return "hello";
    }
}
