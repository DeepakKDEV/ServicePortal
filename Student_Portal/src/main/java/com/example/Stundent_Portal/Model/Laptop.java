package com.example.Stundent_Portal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Entity
public class Laptop {
    @Id
    private String id;
    private String name;
    private String brand;
    private double price;

    @OneToOne
    @JoinColumn(name = "Fk_Student_lp" )
    Student student;
}

