package com.example.Stundent_Portal.Service;

import com.example.Stundent_Portal.Model.Student;
import com.example.Stundent_Portal.Repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo iStudentRepo;

    public String addStudent(List<Student> newStudent) {
      iStudentRepo.saveAll(newStudent);
        return " New Student Added Successfully !!";
    }


    public List<Student> getAll() {
        return iStudentRepo.findAll();
    }

    public String deleteById(String studentId) {
        iStudentRepo.deleteById(studentId);
        return "Student deleted successfully !!";
    }

    public String updateStudentName(String studentId, String name) {
        Student student = iStudentRepo.findById(studentId).orElse(null);
        if (student != null) {
            student.setName((name));
            iStudentRepo.save(student);
        }
        return "Student name updated successfully!";
    }   // service
}
