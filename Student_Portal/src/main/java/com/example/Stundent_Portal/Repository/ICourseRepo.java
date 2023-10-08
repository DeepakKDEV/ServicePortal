package com.example.Stundent_Portal.Repository;

import com.example.Stundent_Portal.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,String> {

}
