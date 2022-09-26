package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
   // @RequestMapping("/student/register")
   @RequestMapping("/register")//locathost:8080/student/register
    public String register(Model model){
       model.addAttribute("student", DataGenerator.createStudent());

        return "student/register";
    }
   // @RequestMapping("/student/drop")
   @RequestMapping("/drop")//locathost:8080/student/drop
    public String drop(){

        return "student/register";
    }
}
