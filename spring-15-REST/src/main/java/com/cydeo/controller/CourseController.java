package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
  //  @ResponseBody
    public List<CourseDTO> getAllCourses(){

        return courseService.getCourses();   // return All courses

       // return "view";//----No
    }
    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id") Long courseId){

        return courseService.getCourseById(courseId);
    }

}
