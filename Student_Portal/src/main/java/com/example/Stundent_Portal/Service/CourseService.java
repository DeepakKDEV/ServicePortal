package com.example.Stundent_Portal.Service;

import com.example.Stundent_Portal.Model.Course;
import com.example.Stundent_Portal.Repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo iCourseRepo;

    public List<Course> getAll() {
        return  iCourseRepo.findAll();
    }

    public String addCourses(List<Course> newCourse) {
        iCourseRepo.saveAll(newCourse);
        return  "New Courses Added Successfully!!";
    }


    public String updateDuration(String id, String myDuration) {
        Course course=iCourseRepo.findById(id).orElse(null);
        if(course!=null){
            course.setDuration(myDuration);
            iCourseRepo.save(course);
        }
        return "update course";
    }

    public String deleteCourse(String id) {
        iCourseRepo.deleteById(id);
        return "delete course";
    }
}

