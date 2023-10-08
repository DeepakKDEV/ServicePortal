package com.example.Stundent_Portal.Service;

import com.example.Stundent_Portal.Model.Laptop;
import com.example.Stundent_Portal.Repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo iLaptopRepo;

    public String addLaptop(List<Laptop> newLaptop) {
        iLaptopRepo.saveAll(newLaptop);
        return  "New Laptop Added Successfully!!";
    }

    public List<Laptop> getAll() {
        return  iLaptopRepo.findAll();
    }

    public String deleteById(String laptopId) {
        iLaptopRepo.deleteById(laptopId);
        return  "Laptop Deleted Successfully!!";
    }

    public String updateStudentName(String laptopId, String newName) {
        Laptop name = iLaptopRepo.findById(laptopId).orElse(null);
        if (name != null) {
            name.setName((newName));
            iLaptopRepo.save(name);
        }
        return "Student name updated successfully!";
    }   // service
}
