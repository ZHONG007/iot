package com.iot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {
    @GetMapping("/greeting")

    public String hello()//@RequestParam(name = "name") String name, Model model) 
    {
        //model.addAttribute("name", name);
        return "hello";
    }
}
