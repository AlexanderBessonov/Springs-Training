package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){//which en point? wwwww.amazon.com/ home
        return "home.html";
    }
    @RequestMapping("/ozzy")
    public String getHomePage2(){
        return "home.html";
    }
    @RequestMapping
    public String getHomePage3(){// nothing and /->default
        return "home.html";
    }
    @RequestMapping({"/apple","/orange"})
    public String getHomePage4(){
        return "home.html";
    }
}
