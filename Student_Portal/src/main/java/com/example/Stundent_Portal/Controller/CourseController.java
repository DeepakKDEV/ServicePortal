package com.example.Stundent_Portal.Controller;

import com.example.Stundent_Portal.Model.Course;
import com.example.Stundent_Portal.Service.CourseService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

     @Autowired
    CourseService courseService;
    @PostMapping("course/post")
    public  String addCourses(@RequestBody List<Course> newCourse){
        return courseService.addCourses(newCourse);
    }


    @GetMapping("courses")
    public  List<Course> getAll(){
        return courseService.getAll();
    }

    @DeleteMapping("delete/course/id/{id}")
    public String deleteCourse(@PathVariable String id){
       return courseService.deleteCourse(id);
    }
    @PutMapping("update/course/id/{id}")
    public String updateDuration(@PathVariable String id, @RequestParam  String myDuration){
        return  courseService.updateDuration(id,myDuration);
    }

}
