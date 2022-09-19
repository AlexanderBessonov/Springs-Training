package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CydeoController {
    @RequestMapping("/cydeo")
    public String getCydeoPage(){
        return "cydeo.html";
    }

    @RequestMapping({"/banana","/super"})
    public String getCydeoPage1(){
        return "cydeo.html";
    }
}
