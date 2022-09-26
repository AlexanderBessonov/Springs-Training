package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {//locathost:8080/mentor/register

    @RequestMapping("/register")
    public String register(){

        return "student/register";
    }
    @RequestMapping("/register")
    public String drop(){

        return "student/register";
    }
}
