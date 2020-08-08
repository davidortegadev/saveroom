package com.codeup.saveroom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "Home page placeholder!";
    }

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }
}
