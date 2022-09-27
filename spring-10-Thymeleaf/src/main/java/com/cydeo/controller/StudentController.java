package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

   // @RequestMapping("/student/register")
   @RequestMapping("/register")//locathost:8080/student/register
    public String register(Model model){
       model.addAttribute("student", DataGenerator.createStudent());

        return "student/register";
    }
    /*
   // @RequestMapping("/student/drop")
   @RequestMapping("/welcome")//locathost:8080/student/welcome?id=3
    public String welcome(@RequestParam int id){
       System.out.println(id);
        return "student/welcome";
    }
     */
    // @RequestMapping("/student/drop")
    @RequestMapping("/welcome")//locathost:8080/student/welcome?name=Ozzy
    public String welcome(@RequestParam String name){

        return "student/welcome";
    }
//        @RequestMapping("/welcome/{name}")//locathost:8080/student/welcome/Ozzy
//        public String welcome2(@PathVariable String name){
//
//
//
//            return "student/welcome";
//        }
}
