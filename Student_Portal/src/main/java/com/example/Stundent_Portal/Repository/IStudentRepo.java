package com.example.Stundent_Portal.Repository;

import com.example.Stundent_Portal.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,String> {
}
