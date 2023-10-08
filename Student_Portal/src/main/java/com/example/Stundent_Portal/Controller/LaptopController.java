package com.example.Stundent_Portal.Controller;

import com.example.Stundent_Portal.Model.Laptop;
import com.example.Stundent_Portal.Service.LaptopService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping("newLaptop")
    public  String addLaptop(@RequestBody List<Laptop> newLaptop){
        return laptopService.addLaptop(newLaptop);
    }


    @GetMapping("laptop")
    public  List<Laptop> getAll(){
        return laptopService.getAll();
    }


    @DeleteMapping("laptop")
    public  String deleteById(@RequestParam String laptopId){
        return  laptopService.deleteById(laptopId);
    }


    @PutMapping("laptopOwner")
    public String updateStudentName(@RequestParam String laptopId, @RequestParam String newName)
    {
        return laptopService.updateStudentName(laptopId, newName);
    }

}
