package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController // @Controller + @ResponseBody
@RequestMapping("/courses/api/v1")
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
    @GetMapping("category/{name}")
    public List<CourseDTO> getCourseByCategory(@PathVariable("name") String category){

        return  courseService.getCoursesByCategory(category);
    }
    @PostMapping
    public CourseDTO createCourse(@RequestBody CourseDTO course){

        return courseService.createCourse(course);
    }
    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id") Long courseId, @RequestBody CourseDTO course){

       courseService.updateCourse(courseId, course);
    }

    @DeleteMapping("{id}")
    public void deleteCourseById(@PathVariable("id") Long courseId){

        courseService.deleteCourseById(courseId);
    }

}
